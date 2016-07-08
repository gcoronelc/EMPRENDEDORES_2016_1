create procedure usp_demo(@email varchar(50))
as
begin
  declare @cont int;

  select @cont = count(*) from profesor 
  where EmailProfesor = @email;

  if( @cont > 0 )
     print 'Ya existe';
  else
    print 'No existe';

end;
go

exec usp_demo 'gcoronel@uni.edu.pe';
go

select * from profesor;


