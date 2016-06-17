alter procedure nuevoempleado
	@Id char(5) output,  @ape varchar(50),
	@nom varchar(50), @feching date, 
	@email varchar(50), @tel varchar(20),
	@IdCargo char(3), @IdDep int
as
declare
	-- Variables del proceso
	@sueldo money,  @com money,  @jefe char(5), @cont int,
	--DECLARAMOS ERRORES Y CONTADOR
	@ErrMsg varchar(1000), @ErrSeverity int
			
begin try

  begin transaction
			
	-- EXTRAEMOS EL VALOR del contador
	update control 
		set @cont = valor + 1, valor = valor + 1 
		where parametro = 'Empleado';

  -- Generar Codigo
	set @Id = 'E' + RIGHT('0000' + CAST(@cont as varchar),4);
  print 'Id: ' + @Id;
						
	-- Sueldo
	select @sueldo = ((sueldo_min + sueldo_max)/2) 
  from cargo where idcargo = @IdCargo;
	if( @@ROWCOUNT = 0 )
	begin
		raiserror('Código de CARGO no existe.',16,1);
		return;
	end;
	
  if( @IdCargo = 'C05' )
    set @com = @sueldo*0.5;
  else
    set @com = null;

	-- Jefe
	select @jefe = idempleado 
  from empleado
	where idcargo IN ('C02','C01') AND iddepartamento = @IdDep;
	if( @@ROWCOUNT = 0 )
	begin
		raiserror('Código de JEFE	 no existe.',16,1);
		return;
	end;
				
  -- Insertar Empleado
	insert into empleado(idempleado,apellido,nombre,fecingreso,email,
	  telefono,idcargo,iddepartamento,sueldo,comision,jefe)
		values(@Id, @ape, @nom, @feching, @email, @tel,
    @IdCargo, @IdDep, @sueldo, @com, @jefe);

  -- Confirmar Tx
	commit transaction

end try
begin catch
	-- Cancelar Tx
	rollback transaction;
  -- Generar el error
	select @ErrMsg = ERROR_MESSAGE(), @ErrSeverity = ERROR_SEVERITY();
	raiserror(@ErrMsg,@ErrSeverity,1)
end catch
go

select * from control;
go

select * from cargo;
go


declare @id char(5)
exec nuevoempleado @id output, 'Condor Aguilar', 
	'Manuel', '20160614', 'manuel@hotmail.com', '999444666','C06','103'
select @id
go



select idcargo, iddepartamento from empleado
where idcargo in ('C01','C02');

select idcargo, iddepartamento from empleado
where iddepartamento = 106;





