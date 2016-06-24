-- Columnas de Auditoria para Matricula

select top 1 * from matricula;
go

alter table Matricula
add aud_fecha date null default getdate();
go

alter table Matricula
add aud_usuario varchar(50) null;
go

alter table Matricula
add aud_host varchar(100) null default host_name();
go

-- Tabla de auditoria de Matricula

CREATE TABLE MATRICULA_AUD(
  id int not null identity primary key,
  IdCursoProg int not null,
  IdAlumno char(5) not null,
  fecha   date not null,
  accion varchar(30) not null,
  columna varchar(50) not null,
  valor_old varchar(200) not null,
  valor_new varchar(200) not null,
  login  varchar(100) null,
  user_sql varchar(100) null,
  user_so varchar(100) null,
  host varchar(100) null,
  aud_fecha date null,
  aud_usuario varchar(50) null,
  aud_host varchar(100) null
);
GO





