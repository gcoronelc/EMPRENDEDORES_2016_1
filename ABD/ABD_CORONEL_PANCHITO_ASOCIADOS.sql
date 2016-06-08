-- ADMINISTRACIÓN DE BASE DE DATOS
-- PRACTICA 03
-- PROFESOR: GUSTAVO CORONEL
-- ESTUDIANTE 1: CORONEL
-- ESTUDIANTE 2: PANCHITO
-- ESTUDIANTE 3: ASOCIADOS

-- REQUERIMIENTO 1: ELIMINAR MATRICULA

ALTER PROCEDURE USP_REG_01
(@IdCursoProg int, @IdAlumno CHAR(5))
AS
BEGIN
	DECLARE
    @Cont int, @AnioActual int, @MesActual int;
	-- Validar IdCursoProg
  select @Cont = count(*) from dbo.CursoProgramado
  where IdCursoProg = @IdCursoProg;
  if( @Cont = 0)
  begin
    raiserror('Codigo de CURSO PROGRAMADO no existe.',16,1);
    return;
  end;
  -- Validar el alumno
  select @Cont = count(*) from dbo.Alumno
  where IdAlumno = @IdAlumno;
  if( @Cont = 0)
  begin
    raiserror('Codigo de ALUMNO no existe.',16,1);
    return;
  end;
  -- Validar si existe la matricula
  select @Cont = count(*) from dbo.Matricula
  where IdCursoProg = @IdCursoProg
  and IdAlumno = @IdAlumno;
  if( @Cont = 0)
  begin
    raiserror('MATRICULA no existe.',16,1);
    return;
  end;
  -- Eliminar Matricula



  -- Actualizar CursoProg
    


  -- Fin
  print 'Proceso ejecutado exitosamente.';
END;
GO

EXEC USP_REG_01 453,'A0025';
GO

SELECT * FROM ALUMNO;
GO






