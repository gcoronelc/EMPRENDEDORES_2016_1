-- Ejercicio 01
-- Función Factorial

create function fnFactorial ( @num int )
returns int
begin
  declare @fact int;
  set @fact = 1;
  while ( @num > 1 )
  begin
	set @fact = @fact * @num;
	set @num = @num - 1;
  end;
  return @fact;
end;
go

select dbo.fnFactorial(5) as Factorial;
go

-- Ejercicio 02
-- Encontrar el mayor de 3 números
-- Desarrollar una función



create function fnMayor
 ( @n1  int ,@n2 int, @n3 int)
returns int
begin
	declare @num int;
	set @num=@n1;
	if(@n1>@num)
	begin
		set @num =@n1;
	end;
	if(@n2>@num)
	begin
		set @num =@n2;
	end;  
	if(@n3>@num)
	begin
		set @num =@n3;
	end;
	return @num;
end;
go

select dbo.fnMayor(12,4,25) as Mayor
go

select dbo.fnMayor(-10,-2,-25) as Mayor
go

select dbo.fnMayor(-10,-2,1) as Mayor
go



alter function nunmayor
 ( @n1 int,@n2 int,@n3 int )
returns int
begin
	declare @res int;
	 if (@n1 >= @n2 and @n1 >= @n3)
		set  @res = @n1;
	 if (@n2 >=  @n1 and @n2 >= @n3)
		set  @res = @n2;
     if (@n3 >=  @n1 and @n3 >= @n2)
		set  @res = @n3;
	return @res;
end;
go
  
select dbo.nunmayor(1,1,-15)
go