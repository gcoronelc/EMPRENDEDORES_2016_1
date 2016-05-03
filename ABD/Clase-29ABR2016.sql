/*
Reto:
De cada categoría se necesita saber cual 
es el producto que tiene mayor stock.
Se deben mostrar los empates.
*/

-- Solución con tablas temporales
alter procedure usp_006A
as
begin
	-- Tabla temporal
	create table #tabla1(
		CategoryID int null,
		UnitsInStock smallint null
	);
	-- Obtener el stock maximo de cada categoria
	insert into #tabla1(CategoryID,UnitsInStock)
	select CategoryID, MAX(UnitsInStock)
	from Products
	group by CategoryID;
	-- Reporte
	select 
		p.CategoryID, p.ProductID, 
		p.ProductName, p.UnitsInStock, p.UnitPrice
	from Products p join #tabla1 t 
	on p.CategoryID=t.CategoryID 
	and p.UnitsInStock = t.UnitsInStock;
end;

EXEC usp_006A;
go




-- Solución con sub-consulta
-- como tabla derivada
create procedure usp_006B
as
begin
	select 
		p.CategoryID, p.ProductID, 
		p.ProductName, p.UnitsInStock, p.UnitPrice
	from Products p 
	join (select CategoryID, MAX(UnitsInStock) UnitsInStock
			from Products
			group by CategoryID) t 
	on p.CategoryID=t.CategoryID 
	and p.UnitsInStock = t.UnitsInStock;
end;

EXEC usp_006B;
go





-- Solución utilizando common table expression
create procedure usp_006C
as
begin
	with v1 as (select CategoryID, MAX(UnitsInStock) UnitsInStock
			from Products
			group by CategoryID) 
	select 
		p.CategoryID, p.ProductID, 
		p.ProductName, p.UnitsInStock, p.UnitPrice
	from Products p join v1
	on p.CategoryID = v1.CategoryID 
	and p.UnitsInStock = v1.UnitsInStock;
end;

EXEC usp_006C;
go


/*
De cada categoria se necesita saber el 
productos mas vendido.
*/

alter procedure usp_007
as
begin
	-- Tabla temporal de unidades vendidas por articulo
	create table #tabla1(
		CategoryID int null,
		ProductID int null,
		ProductName varchar(80) null,
		Cant smallint null
	);
	-- Obtener unidades vendidas por articulo
	insert into #tabla1(CategoryID,ProductID,ProductName,Cant)
	select 
		p.CategoryID, p.ProductID, 
		p.ProductName, SUM(od.Quantity) Cant
	from Products p
	join [Order Details] od on p.ProductID = od.ProductID
	group by p.CategoryID, p.ProductID,p.ProductName;
	-- Tabla temporal de maxima cantidad
	-- de unidades vendidas de un producto
	-- por categoria
	create table #tabla2(
		CategoryID int null,
		Cant int null
	);
	-- LLEnado de la #tabla2
	insert into #Tabla2(CategoryID,Cant)
	select CategoryID, MAX(Cant) cant
	from #tabla1
	group by CategoryID;
	-- Reporte previo
	select 
		t1.CategoryID Categoris, 
		t1.ProductID CodPrducto,
		t1.ProductName NomProducto, 
		t1.Cant CantVendida
	from #tabla1 t1 join #tabla2 t2
	on t1.CategoryID = t2.CategoryID
	and t1.Cant = t2.Cant
	order by 1, 2;
end;
GO

EXEC usp_007;
go


/*
Realizar la modificación respectiva
al procedimiento usp_007
para que el proceso sea de un 
año especifico.
*/

alter procedure usp_008(@Anio int)
as
begin
	-- Tabla temporal de unidades vendidas por articulo
	create table #tabla1(
		CategoryID int null,
		ProductID int null,
		ProductName varchar(80) null,
		Cant smallint null
	);
	-- Obtener unidades vendidas por articulo
	insert into #tabla1(CategoryID,ProductID,ProductName,Cant)
	select 
		p.CategoryID, p.ProductID, 
		p.ProductName, SUM(od.Quantity) Cant
	from Products p
	join [Order Details] od on p.ProductID = od.ProductID
	join Orders o on od.OrderID = o.OrderID
	where YEAR(o.OrderDate) = @Anio
	group by p.CategoryID, p.ProductID,p.ProductName;
	
	-- Reporte previo
	with t2 as (
		select CategoryID, MAX(Cant) cant
		from #tabla1
		group by CategoryID)
	select 
		t1.CategoryID Categoris, 
		t1.ProductID CodPrducto,
		t1.ProductName NomProducto, 
		t1.Cant CantVendida
	from #tabla1 t1 join t2
	on t1.CategoryID = t2.CategoryID
	and t1.Cant = t2.Cant
	order by 1, 2;
end;
GO

EXEC usp_008 1996;
go

/*
Hacer un procedimiento que permita
que consultar de cada año el
cliente que mas a comprado.
*/



select * from Orders;



select *
from [Order Details];




SELECT * FROM Products
where CategoryID in (1,4,6);

sp_help products;
go
