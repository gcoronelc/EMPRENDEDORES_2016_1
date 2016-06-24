-- CREACIÓN DE UN LOG

CREATE TABLE AUDITORIA(
  id int not null identity primary key,
  fecha   date not null,
  tabla varchar(100) not null,
  accion varchar(30) not null,
  columna varchar(50) not null,
  valor_old varchar(200) not null,
  valor_new varchar(200) not null,
  login  varchar(100) null,
  user_sql varchar(100) null,
  user_so varchar(100) null,
  host varchar(100) null
);
GO

alter TRIGGER dbo.tr_curso_update_precio_log
ON curso 
FOR UPDATE
AS 
BEGIN

  declare @precio_old money, @precio_new money;

  if( UPDATE (cur_precio) )
  begin
    select @precio_old = cur_precio from deleted;
    select @precio_new = cur_precio from inserted;
    insert into AUDITORIA(fecha,tabla,accion,columna,valor_old,
      valor_new,login,user_sql,user_so,host)
    values(GETDATE(),'CURSO','UPDATE','cur_precio',
      cast(@precio_old as varchar), cast(@precio_new as varchar),
      SUSER_NAME(),USER_NAME(),NULL,HOST_NAME());
  end;

END;
GO

update curso set cur_precio = 1350.0 where cur_id = 1;
go

select * from auditoria;
go

select SUSER_NAME();
GO





