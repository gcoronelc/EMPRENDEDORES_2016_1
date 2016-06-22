-- Base de Datos
create database gustavo;
go

use gustavo;
go

-- Tabla Producto
create table producto(
ProductoId int not null primary key,
NomProducto varchar(100) not null Unique,
PrecioLista Money not null check(PrecioLista > 0.0),
Stock int not null check(Stock > 0),
Activo int not null check(Activo IN (1,0))
);
go

-- Datos de la tabla producto



-- Tabla Venta






