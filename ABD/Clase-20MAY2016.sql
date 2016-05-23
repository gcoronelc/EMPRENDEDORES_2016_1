-- MCD y MCM de dos números
create procedure uspMcdMcm
(@n1 int, @n2 int, @mcd int out, @mcm int out)
as
begin
	declare @n1x int, @n2x int;
	set @n1x = @n1;
	set @n2x = @n2;
	-- Calcular MCD
	while( @n1x <> @n2x )
	begin
		if(@n1x > @n2x)
			set @n1x = @n1x - @n2x;
		else 
			set @n2x = @n2x - @n1x;	
	end;
	set @mcd = @n1x;
	-- Calcular MCM
	set @mcm = @n1 * @n2 / 	@mcd
end;
GO

BEGIN
	declare @a int, @b int;
	exec uspMcdMcm 15, 20, @a out, @b out;
	print  'MCD: ' + cast(@a as varchar);
	print  'MCM: ' + cast(@b as varchar);
END;
GO


-- Serie Fibonacci
-- Reyes
-- @m > 2

alter proc uspFibonacci (@n int)
as
begin
	declare @a int, @b int, @c int, @cont int;
	declare @texto varchar(2000);
	-- Valores iniciales
	set @texto = '0  1'; 
	set @a = 0;
	set @b = 1;
	set @cont = 2;
	-- Proceso
	while @cont < @n
	begin
		set @c= @a + @b;
		set @a = @b;
		set @b = @c;
		set @texto = @texto + '   ' + CAST(@c as varchar);
		set @cont = @cont + 1;
	end;
	-- Reporte
	print @texto;
end;
go

exec uspFibonacci 15;
go
			
---promedio
--carmen dominguez

create function fn_promedio
(@valor1 decimal (4,2),
@valor2 decimal (4,2),
@valor3 decimal (4,2),
@valor4 decimal (4,2)
)
returns decimal (6,2)
as
begin
	declare @result decimal (6,2), @menor decimal(6,2);
	set @menor =@valor1 ;
	if(@valor2  <@menor)
		set  @menor =@valor2 ;
	if(@valor3   <@menor)
		set  @menor =@valor3  ;
	if(@valor4   <@menor)
		set  @menor =@valor4  ;
	set @result =(@valor1 +@valor2 +@valor3 +@valor4 -@menor )/3;
	return @result;
end;
go

select dbo.fn_promedio  (15,15,15,5) as promedio;
go

-- Actualizar nota
-- @@ROWCOUNT

create procedure uspActualizaNota
(@IdCursoProg int, @IdAlumno char(5), 
@nota numeric(4,2), @tipo char(2))
-- @tipo = EP, EF
as
begin
	if(@tipo <> 'EP' and @tipo <> 'EF')
	begin
		print 'Tipo de examen incorrecto.';
		return;
	end
	if(@tipo = 'EP')
		update Matricula
		set ExaParcial = @nota
		where IdCursoProg = @IdCursoProg and IdAlumno = @IdAlumno;
	else 
		update Matricula
		set ExaFinal = @nota
		where IdCursoProg = @IdCursoProg and IdAlumno = @IdAlumno;	
	if(@@ROWCOUNT = 0)
		print 'Datos incorrectos.';
	else
		print 'Proceso ejecutado correctamente.';
end;
go

exec uspActualizaNota 8028, 'A0048', 18, 'EP';
go

select * from Matricula
order by 1 desc;
go		
		





