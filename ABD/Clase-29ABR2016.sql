/*
Listar los productos de Northwind
*/
create procedure usp_001
as
begin
	select 
		ProductID ID, 
		CategoryID CATEGORIA,
		ProductName NOMBRE,
		UnitPrice PRECIO,
		UnitsInStock STOCK,
		QuantityPerUnit UNIDAD
	from Products;	
end;
go

EXEC usp_001;
go

/*
Modificar el procedimiento anterior
para que permita consultar los
productos de una categoría.
*/

create procedure usp_002
( @Categoria int )
as
begin
	select 
		ProductID ID, 
		CategoryID CATEGORIA,
		ProductName NOMBRE,
		UnitPrice PRECIO,
		UnitsInStock STOCK,
		QuantityPerUnit UNIDAD
	from Products
	where CategoryID = @Categoria;	
end;
go

EXEC usp_002 2;
GO

/*
Consultar productos de varias 
categorías.
*/

alter procedure usp_003
( @Categorias varchar(500) )
as
declare
   @sentencia varchar(1000)
begin
	set @sentencia = '
	select 
		ProductID ID, 
		CategoryID CATEGORIA,
		ProductName NOMBRE,
		UnitPrice PRECIO,
		UnitsInStock STOCK,
		QuantityPerUnit UNIDAD
	from Products
	where CategoryID IN ' + @Categorias;	
	exec (@sentencia);
end;
go

EXEC usp_003 '(1,4,6)';
GO

/*
Modificar la usp_001 para que permita
consultar el stock y valorizado por
categoria.
*/

create procedure usp_004
as
begin
	select 
		CategoryID CATEGORIA,
		SUM(UnitsInStock) STOCK,
		SUM(UnitPrice*UnitsInStock) VALORIZADO
	from Products
	group by CategoryID;	
end;
go

EXEC usp_004;
go

/*
Modificar el usp_004 de tal manera 
que permita mostrar el nombre de la categoria.
*/

-- OP 1
create procedure usp_005A
as
begin
	select 
		c.CategoryID CATEGORIA,
		c.CategoryName NOMBRE,
		SUM(p.UnitsInStock) STOCK,
		SUM(p.UnitPrice*p.UnitsInStock) VALORIZADO
	from Products p
	join Categories c on p.CategoryID = c.CategoryID
	group by c.CategoryID, c.CategoryName;
end;
go

EXEC usp_005A;
go

-- OP 2
alter procedure usp_005B
as
begin
	with vResumen as (
		select 
			CategoryID CATEGORIA,
			SUM(UnitsInStock) STOCK,
			SUM(UnitPrice*UnitsInStock) VALORIZADO
		from Products
		group by CategoryID)
	select v.CATEGORIA,
	c.CategoryName NOMBRE, v.STOCK, v.VALORIZADO
	from vResumen v join Categories c 
	on v.CATEGORIA = c.CategoryID;	
end;
go

EXEC usp_005B;
go

-- OP Con tablas temporales
-- Reto

alter procedure usp_005C
as
begin
	with vResumen as (
		select 
			CategoryID CATEGORIA,
			SUM(UnitsInStock) STOCK,
			SUM(UnitPrice*UnitsInStock) VALORIZADO
		from Products
		group by CategoryID)
	select v.CATEGORIA,
	c.CategoryName NOMBRE, v.STOCK, v.VALORIZADO
	from vResumen v join Categories c 
	on v.CATEGORIA = c.CategoryID;	
end;
go


/*
Reto:
De cada categoría se necesita saber cual 
es el producto que tiene mayor stock.
Se deben mostrar los empates.
*/

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





SELECT * FROM Products
where CategoryID in (1,4,6);

sp_help products;
go
