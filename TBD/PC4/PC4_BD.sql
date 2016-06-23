
CREATE DATABASE TBDPC4;
USE TBDPC4;
--creando tablas

CREATE TABLE PRODUCTO(
ProductoId int not null PRIMARY KEY,
NomProducto varchar(100) not null UNIQUE,
PrecioLista money not null  check (PrecioLista>0),
Stock int not null check (Stock >0),
Activo int not null check(Activo in (1,0))
);
go

CREATE TABLE VENTAS(
NroVenta int not null PRIMARY KEY,
fecha date not null,
cliente varchar (100) not null,
DirCliente varchar (100) not null,
ProductoId int not null FOREIGN KEY REFERENCES PRODUCTO(ProductoId),
PrecioVenta money not null CHECK (PrecioVenta>0.0),
Cantidad int not null check(Cantidad>0),
Importe money not null,
);
go
INSERT INTO PRODUCTO(ProductoId,NomProducto,PrecioLista,Stock,Activo)
VALUES(001,'CERVEZA', 20.00,1000,1);
GO
INSERT INTO PRODUCTO(ProductoId,NomProducto,PrecioLista,Stock,Activo)
VALUES(002,'PAN', 5.80,200.00,0);
GO

INSERT INTO PRODUCTO(ProductoId,NomProducto,PrecioLista,Stock,Activo)
VALUES(003,'LECHE', 3.00,500,1);
GO
INSERT INTO PRODUCTO(ProductoId,NomProducto,PrecioLista,Stock,Activo)
VALUES(004,'ARROZ', 2.50,300,1);
GO
INSERT INTO PRODUCTO(ProductoId,NomProducto,PrecioLista,Stock,Activo)
VALUES(005,'FIDEOS', 4.00,400.00,0);
GO
SELECT *FROM PRODUCTO;
GO

INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(100,'11-JUNIO-2016','JUAN PEREZ','AV JAVIER PRADO 165',003,3.00,80,240.00);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(101,'12-JUNIO-2016','JULIO ARBIETO','AV TOMAS VALLE 154',003,3.00,120,360.00);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(102,'13-JUNIO-2016','MARITZA CHUJE','AV DOMINICOS 235',003,3.00,180,540.00);
GO

INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(103,'20-JUNIO-2016','RONALD CRUZ','AV UNIVERSITARIA  765',001,20.00,50,1000.00);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(104,'21-JUNIO-2016','OLIVA NUÑEZ','AV TACNA  2765',001,20.00,90,1800.00);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(105,'22-JUNIO-2016','AUGUSTO RAMOS ','AV MEXICO  12',001,20.00,15,300.00);
GO

INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(106,'2-JULIO-2016','LUCIA FERNANDEZ ','AV PANAMA 201',002,5.80,75,435.00);
GO

INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(107,'3-JULIO-2016','PAQUITA SORIA ','AV VAQUITAS 300',002,5.80,56,324.80);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(108,'4-JULIO-2016','LUCAS SILVA ','AV OJITOS LINDOS 1254',002,5.80,6,34.80);
GO

INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(109,'2-JULIO-2016','LUCIA FERNANDEZ ','AV PANAMA 201',004,2.50,15,37.50);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(110,'30-JULIO-2016','BRIGITH DIAZ ','AV DEL PRADO',004,2.50,90,225.00);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(111,'29-JULIO-2016','JUN CARDENAS ','AV LAS FLORES 194',004,2.50,300,750);
GO

INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(112,'14-AGOSTO-2016','PEPITO LOPEZ ','AV INDUSTRIAL 1872',005,4.00,16,64.00);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(113,'19-AGOSTO-2016','WALTER SAJAMI ','AV POTAL 5072',005,4.00,11,44.00);
GO
INSERT INTO VENTAS(NroVenta,fecha,cliente,DirCliente,ProductoId,PrecioVenta,Cantidad,Importe)
VALUES(114,'15-AGOSTO-2016','RAUL PACHECO','AV FILPOS DEL CASAS 1213',005,4.00,136,544.00);
GO
 SELECT  *FROM VENTAS;


 -----CONSULTAS
 ----pregunta 1
select NomProducto,PrecioLista from TBDPC4.dbo.PRODUCTO;
go 

select  NroVenta, fecha, cliente, Importe from TBDPC4.dbo.VENTAS
where Importe>500.00;


 ----pregunta 2
select NomProducto,PrecioLista from TBDPC4.dbo.PRODUCTO;
go 
--pregunta 3
select NroVenta,fecha,ProductoId,Cantidad,Importe from TBDPC4.dbo.VENTAS
where ProductoId=003;

--pregunta 4
select cliente, NroVenta, Importe from TBDPC4.dbo.VENTAS
where cliente like '_o%';

--´pregunta 5
select  NroVenta,cliente,DirCliente,Importe from TBDPC4.dbo.VENTAS
where Importe>500 AND DirCliente='AV DOMINICOS 235' OR DirCliente='AV LAS FLORES 194';
GO
-- PREGUNTA 6
SELECT NroVenta,cliente,PrecioVenta,Cantidad,Importe FROM TBDPC4.dbo.VENTAS
where cliente like '_e,a,u%' and Cantidad >=10 or Cantidad <=20;

