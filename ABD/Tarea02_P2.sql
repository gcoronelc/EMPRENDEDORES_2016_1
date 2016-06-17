

select * from empleado
select * from cargo
select * from control
SELECT * FROM departamento
select * from ubicacion

ALTER procedure nuevoempleado
	@Id char(5) output,@ape varchar(50),@nom varchar(50),@feching date,@email varchar(50),
	@tel varchar(20),@IdCargo char(3),@IdDep int,@sueldo money,@com money,@jefe char(5)
as
	declare
		--DECLARAMOS ERRORES Y CONTADOR
			@ErrMsg varchar(1000),
			@ErrSeverity int,
			@cont int
			
		begin try
			begin transaction
			
			--EXTRAEMOS EL VALOR ACTUAL
			update control 
				set @cont = valor + 1, valor = valor + 1 
				where parametro = 'Empleado'
				
				--VALIDAMOS EL UBI
			/*	select @ubi = idubicacion 
				from ubicacion where idubicacion = @ubi
							if( @@ROWCOUNT = 0 )
				begin
					raiserror('Código de UBI no existe.',16,1);
					return;
				end;*/
				
				--sueldo
				select @sueldo = ((sueldo_min + sueldo_max)/2)from cargo
				where idcargo = @IdCargo
				if( @@ROWCOUNT = 0 )
				begin
					raiserror('Código de CARGO no existe.',16,1);
					return;
				end;
				
				
				--comision
					select @com = (@sueldo*0.5)from cargo
				where idcargo = 'C05'
				if( @@ROWCOUNT = 0 )
				begin
					raiserror('Código De que no es VENDEDOR.',16,1);
					return;
				end;
				--GERENTE
					select @jefe = idempleado from empleado
				where idcargo = 'C02' AND iddepartamento = @IdDep OR idcargo = 'C01' AND iddepartamento = @IdDep 
				if( @@ROWCOUNT = 0 )
				begin
					raiserror('Código de JEFE	 no existe.',16,1);
					return;
				end;
				
				--AGREGAMOS CAMPOS		
			set @Id = 'E' + RIGHT('0000' + CAST(@cont as varchar),4)
			insert into empleado(idempleado,apellido,nombre,fecingreso,email,
								 telefono,idcargo,iddepartamento,sueldo,comision,jefe)
			 values(@Id,@ape,@nom,@feching,@email,@tel,@IdCargo,@IdDep,@sueldo,@com,@jefe)
			commit transaction
		end try
		begin catch
		--DEMAS WEBADAS
			rollback transaction
			select @ErrMsg = ERROR_MESSAGE(), @ErrSeverity = ERROR_SEVERITY();
			raiserror(@ErrMsg,@ErrSeverity,1)
		end catch

go




declare @id char(5)
exec nuevoempleado @id output, 'Condor Aguilar', 
	'Manuel', '2016-06-14', 'manuel@hotmail.com', '999444666','C03','103','','',''
select @id
go



select * from empleado






