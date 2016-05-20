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
