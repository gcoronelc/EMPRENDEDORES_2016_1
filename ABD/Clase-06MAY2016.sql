
-- Ejercicio 01
-- Consultar los cursos  programados de un año.

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


/*
Ejercicio 03
Se necesita saber en cuantos cursos
se ha matriculado cada estudiante en
un determinado ciclo, tambien se necesita 
saber cuantos cursos tiene aprobado y cuantos
desaprobados.
La nota aoprobatoria es 13.0.
*/

alter procedure usp_edutec_003
( @ciclo varchar(7) )
as
begin

  select 
		a.IdAlumno,
		a.NomAlumno,
		a.ApeAlumno,
		COUNT(*) cursos_mat,
		SUM (case when m.Promedio >= 11.0 then 1 else 0 end) aprob,
		SUM (case when m.Promedio < 11.0 then 1 else 0 end) desap
  from  alumno a
  join matricula m on a.IdAlumno = m.IdAlumno
  join CursoProgramado cp on m.IdCursoProg = cp.IdCursoProg
  where cp.IdCiclo = @Ciclo
  group by a.IdAlumno, a.NomAlumno, a.ApeAlumno;

end;
go

exec usp_edutec_003 '2016-01';
go


/*
Ejercicio 04
Se necesita el profesor que mas estudiantes desaprobados tiene en cada ciclo de un
determinado periodo.
También la cantidad de cursos asignados.
*/


alter procedure usp_edutec_004
( @periodo varchar(4) )
as
begin
	-- Tabla temporal para el resumen previo
	create table #resumen(
	  IdCiclo char(7) null,
	  IdProfesor char(4) null,
	  Cursos int null,
	  Matriculados int null, 
	  Desaprobados int null
	);
	-- Se inserta el rsumen
	insert into #resumen(IdCiclo,IdProfesor,
	Cursos,Matriculados,Desaprobados)  
	select cp.IdCiclo, cp.IdProfesor,
	COUNT(distinct cp.IdCursoProg) Aulas,
	COUNT(m.IdAlumno) Matriculados,
	SUM(case when m.Promedio < 11.0 then 1 else 0 end) Desprobados
	from  CursoProgramado cp 
	join matricula m on cp.IdCursoProg = m.IdCursoProg
	where cp.IdProfesor is not null
	and  cp.IdCiclo like @periodo + '%'
	group by cp.IdCiclo,cp.IdProfesor;
	-- Consulta final
	with v1 as (
		select IdCiclo, MAX(Desaprobados) Desaprobados 
		from #resumen 
		group by IdCiclo)
	select 
		r.IdCiclo, r.IdProfesor, p.ApeProfesor, p.NomProfesor,
		r.Cursos, r.Matriculados, r.Desaprobados, 
		CAST(r.Desaprobados * 100.0/r.Matriculados AS DECIMAL(10,2)) Porcentaje
	from #resumen r
	join v1 on r.IdCiclo = v1.idCiclo and r.Desaprobados = v1.Desaprobados
	join Profesor p on r.IdProfesor = p.IdProfesor
	order by 1 ,  2;
end;
go

exec usp_edutec_004 '2015';
go



select COUNT(distinct Clave) from Profesor;

select * from Profesor;

sp_help alumno;
go

select top 1 * from CursoProgramado;
go
