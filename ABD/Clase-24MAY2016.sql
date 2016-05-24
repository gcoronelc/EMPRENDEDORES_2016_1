select * from edutec.dbo.Profesor;
select @@ROWCOUNT, @@ERROR;
go

/*
Ejercicio 01
Desarrollar un procedimiento que
permita actualizar la nota de un estudiantes
en un curso.
*/


select * from Matricula
order by 1 desc;
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
		if(@@ROWCOUNT = 0)
			raiserror('Datos incorrectos.',16,1);
		return;
	end;
END;
GO

select * from Matricula order by 1 desc;
go

exec usp_act_nota 8024,'A0048',15,'EP';
go


/*
Ejercicio 02
Desarrollar un procedimiento que permita
matricular a un estudiante.
*/
create procedure usp_matricula
( @IdCursoProg int, @IdAlumno char(5) )
as
BEGIN
	-- Variables
	declare @Vacantes int;
	-- Ver si hay vacantes
	select @Vacantes = Vacantes 
	from CursoProgramado where IdCursoProg = @IdCursoProg;
	if( @@ROWCOUNT = 0 )
	begin
		raiserror('Código de curso programado no existe.',16,1);
		return;
	end;
	if( @Vacantes = 0 )
	begin
		raiserror('Curso no tiene vacantes disponibles.',16,1);
		return;
	end;
	-- Matricula
	insert into Matricula(IdCursoProg,IdAlumno)
	values(@IdCursoProg,@IdAlumno);
	if(@@ERROR <> 0)
	begin
		raiserror('Matricula ya se encuentra registrada.',16,1);
		return;
	end;
	-- Actualizar vacantes
	
END;
GO

select * from CursoProgramado where IdCursoProg = 8024;
select * from Matricula where IdCursoProg = 8024 order by 2;
go

exec usp_matricula 8024, 'A0001';
GO






