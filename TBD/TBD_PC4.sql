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
insert into Producto(ProductoId,NomProducto,PrecioLista,Stock,Activo)
values(1000,'Helado de Fresa',5.80,1000,1);
go

insert into Producto(ProductoId,NomProducto,PrecioLista,Stock,Activo)
values(2000,'Arros con Leche',7.80,2000,0);
go

select * from Producto;
go


-- Tabla Venta


-- Insertar Ventas

insert into venta(NroVenta,Fecha,Cliente,DirCliente,
ProductoId,PrecioVenta,Cantidad,Importe)
values(500,'20160120','Gustavo','Mi Casa',
1000,8.0,10,80);
go





