-- ===============================
-- SELECCIÓN DE COLUMNAS
-- ===============================

/*
Pregunta 1:
Desarrolle una sentencia SELECT para consultar 
el id, nombre, apellido y email de todos los 
alumnos. Base de datos EDUTEC.
*/

select IdAlumno, NomAlumno, ApeAlumno, EmailAlumno
from EduTec.dbo.Alumno;
go


/*
Pregunta 2
Desarrolle una sentencia SELECT para consultar 
el id, nombre, apellido y email de todos los 
profesores. Base de datos EDUTEC.
*/

select IdProfesor, NomProfesor, ApeProfesor, EmailProfesor
from EduTec.dbo.Profesor;
go


/*
Pregunta 3

Desarrolle una sentencia SELECT para obtener de 
cada curso programado la siguiente información: 
id, id del curso, id del ciclo, Precio y horario. 
Base de datos EDUTEC.
*/

select IdCursoProg, IdCurso, IdCiclo, PreCursoProg, Horario
from EduTec.dbo.CursoProgramado;
go


/*
Pregunta 4

Desarrolle una sentencia SELECT para consultar 
el nombre, apellido y email de los empleados 
de la base de datos RH.
*/

select nombre, apellido, email from RH.dbo.empleado;
go

/* 
Pregunta 5

Desarrolle una sentencia SELECT 
para consultar el nombre, vacantes y precio 
de cada curso de la base de datos EDUCA.
*/

select  cur_nombre, cur_vacantes, cur_precio from EDUCA.dbo.CURSO;



-- ===============================
-- CAMPOS CALCULADOS
-- ===============================

/*
Pregunta 6
Desarrollar una sentencia SELECT que permita 
obtener el importe que se obtendría por cada 
curso programado si se logra vender todas las 
vacantes. Base de datos EDUTEC.
*/

select *, 
(Vacantes + Matriculados) * PreCursoProg AS "INGRESO ESTIMADO"
from EduTec.dbo.CursoProgramado;
go




-- ===============================
-- FILTROS DE FILAS
-- ===============================

/*
Pregunta 11. 

Desarrollar una sentencia SELECT para 
consultar los empleados del departamento 
de contabilidad. Base de datos RH.
*/

-- Averiguar el codigo de contabilidad
select * from rh.dbo.departamento;
go

-- Codigo= 101

select *
from rh.dbo.empleado
where iddepartamento = 101;
go
 
 --pregunta 12
 /*Desarrolle una sentencia SELECT para consultar los cursos 
 programados del ciclo 2013-02 de la base de datos EDUTEC.
 */
 select * from EduTec.dbo.CursoProgramado
 where IdCiclo='2013-02';
 go
 ----PREGU8NTA 13
 ---Desarrolle una sentencia SELECT para consultar los cursos 
 -- programados del profesor GUSTAVO CORONEL. base de datos EDUTEC.
 -- paso1..... averiguar codigo del profesor
select * from EduTec.dbo.Profesor;
go

--codigo: P002

select * from EduTec.dbo.CursoProgramado
where IdProfesor='P002';
GO


-- ==============================
-- Operadores Logicos
-- ==============================













