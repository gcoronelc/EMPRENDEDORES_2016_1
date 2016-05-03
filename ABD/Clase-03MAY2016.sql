
-- Ejercicio 01
-- Consultar los cursos de un año.

alter procedure usp_edutec_001
( @anio varchar(4) )
as
begin
  select 
	cp.IdCursoProg ID,
	c.IdCurso, c.NomCurso,
	cp.Vacantes, cp.Matriculados,
	ISNULL(p.IdProfesor,'NONE') IdProfesor, 
	ISNULL(p.NomProfesor,'NONE') NomProfesor
  from Curso c
  join CursoProgramado cp on c.IdCurso = cp.IdCurso
  left join  Profesor p on cp.IdProfesor = p.IdProfesor
  where IdCiclo like @anio + '%'
end;
go
 
exec usp_edutec_001 '2010';
go

select COUNT(*)
from CursoProgramado
where IdCiclo like '2010%';
go



/*
Ejercicio 02
Se necesita saber los estudiantes que se han 
matriculado en mas cursos por cada ciclo
en un determinado periodo.
*/

alter procedure usp_edutec_002
( @anio varchar(4) )
as
begin
	create table #resumen(
		IdCiclo char(7) null,
		IdAlumno char(5) null,
		CantMat int null
	);
	
	insert into #resumen(IdCiclo,IdAlumno,CantMat)
	select cp.IdCiclo, m.IdAlumno, COUNT(*)
	from CursoProgramado cp
	join Matricula m 
	on cp.IdCursoProg = m.IdCursoProg
	where cp.IdCiclo like @anio + '%'
	group by cp.IdCiclo, m.IdAlumno;
	
	with v1 as (
		select IdCiclo, MAX(CantMat) CantMat
		from #resumen
		group by IdCiclo)
	select 
		r.IdCiclo, a.IdAlumno, 
		a.NomAlumno, a.ApeAlumno, r.CantMat
	from #resumen r
	join v1 on r.IdCiclo = v1.IdCiclo and r.CantMat = v1.CantMat
	join Alumno a on r.IdAlumno = a.IdAlumno
	order by 1, 2;
	
end;
go

exec usp_edutec_002 '2015';
go




sp_help alumno;
go

select * from CursoProgramado;
go
