select * from edutec.dbo.Profesor;
select @@ROWCOUNT, @@ERROR;
go

/*
Desarrollar un procedimiento que
permita actualizar la nota de un estudiantes
en un curso.
*/


select * from Matricula;
go

alter procedure usp_act_nota
( @IdCursoProg int, @IdAlumno char(5),  
  @Nota numeric(4,2), @TipoNota char(2) )
AS
BEGIN
	if( @TipoNota <> 'EP' and @TipoNota <> 'EF' and @TipoNota <> 'ES' )
	begin
		raiserror('Tipo de nota no es correcto',16,1);
		return;
	end;
	if(  @Nota < 0.0 or @Nota > 20.0 )
	begin
		raiserror('Nota fuera de rango: [0,20]',16,1);
		return;
	end;
	if( @TipoNota = 'EP')
	begin
		update Matricula set ExaParcial = @Nota,
		Promedio = (@Nota + ExaFinal) / 2 
		where IdCursoProg = @IdCursoProg and IdAlumno = @IdAlumno;
		if(@@ROWCOUNT == 0)
			raiserror('Datos incorrectos.',16,1);
		return;
	end;
END;
GO

exec usp_act_nota 4,'A0001',34,'EP';
go




