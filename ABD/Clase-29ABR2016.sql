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






SELECT * FROM Products
where CategoryID in (1,4,6);

sp_help products;
go
