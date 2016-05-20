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
			




