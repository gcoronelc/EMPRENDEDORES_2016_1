-- CREACIÓN UNA TABLA DE AUDITORIA PARA CURSO

CREATE TABLE CURSO_AUD(
  id int not null identity primary key,
  cur_id int not null,
  fecha   date not null,
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

CREATE TRIGGER dbo.tr_curso_update_precio_aud
ON curso FOR UPDATE
AS 
BEGIN

  declare @precio_old money, @precio_new money, @cur_id int;

  if( UPDATE (cur_precio) )
  begin
    select @cur_id = cur_id, @precio_old = cur_precio from deleted;
    select @precio_new = cur_precio from inserted;
    insert into CURSO_AUD(cur_id,fecha,accion,columna,valor_old,
      valor_new,login,user_sql,user_so,host)
    values(@cur_id,GETDATE(),'UPDATE','cur_precio',
      cast(@precio_old as varchar), cast(@precio_new as varchar),
      SUSER_NAME(),USER_NAME(),NULL,HOST_NAME());
  end;

END;
GO

update curso set cur_precio = 1400.0 where cur_id = 1;
go

update curso set cur_precio = 1600.0 where cur_id = 3;
go

select * from curso;
select * from CURSO_AUD order by 1 desc;
go

select SUSER_NAME();
GO





