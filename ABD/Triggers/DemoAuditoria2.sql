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
  aud_host varchar(50) null
);
GO

-- Trigger de Auditoria
CREATE TRIGGER dbo.tr_matricula_update_notas_aud
ON matricula FOR UPDATE
AS 
BEGIN

  declare @nota_old numeric(4,2), @nota_new numeric(4,2), 
          @IdCursoProg int, @IdAlumno char(5),
          @aud_fecha date, @aud_usuario varchar(50),
          @aud_host varchar(50);
  
  -- PK y Datos de Auditoria
  select 
    @IdCursoProg = IdCursoProg, @IdAlumno = IdAlumno,
    @aud_fecha = aud_fecha, @aud_usuario = aud_usuario,
    @aud_host = aud_host
  from deleted;

  -- Verificando ExaParcial
  if( UPDATE (ExaParcial) )
  begin
    select @nota_old = ExaParcial from deleted;
    select @nota_new = ExaParcial from inserted;
    if(@nota_old != @nota_new)
    begin
      insert into MATRICULA_AUD(IdCursoProg,IdAlumno,fecha,accion,
        columna,valor_old,valor_new,login,user_sql,user_so,host,
        aud_fecha,aud_usuario,aud_host)
      values(@IdCursoProg,@IdAlumno,GETDATE(),'UPDATE','ExParcial',
        cast(@nota_old as varchar), cast(@nota_new as varchar),
        SUSER_NAME(),USER_NAME(),NULL,HOST_NAME(),
        @aud_fecha,@aud_usuario,@aud_host);
    end;
  end;

END;
GO



