select * from curso;
go

create TRIGGER dbo.tr_curso_update
ON curso 
FOR UPDATE
AS 
BEGIN

  declare @precio_old money, @precio_new money;


  print 'Parece que algo ha cambiado en la tabla CURSO.'; 
  
  if( UPDATE (cur_precio) )
  begin
    print 'La columna CUR_PRECIO ha cambiado.';
    select @precio_old = cur_precio from deleted;
    select @precio_new = cur_precio from inserted;
    print 'Precio Old: ' + cast( @precio_old as varchar );
    print 'Precio New: ' + cast( @precio_new as varchar );
  end;

END;
GO

update curso set cur_profesor = 'Sergio el Bravo' where cur_id = 1;
go

update curso set cur_precio = 1250.0 where cur_id = 1;
go
