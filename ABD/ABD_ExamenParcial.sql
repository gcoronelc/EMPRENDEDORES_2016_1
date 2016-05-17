-- Pregunta 1
/*
Desarrollar un procedimiento almacenado que 
permita consultar los cursos programados activos
de un profesor en un ciclo especifico.
*/

create procedure egcc_req_01
(@ciclo char(7), @profesor char(4))
as
begin
	select 
	    IdCursoProg as Id,
		IdCiclo as Ciclo,
		IdCurso as Curso,
		Matriculados,
		Horario
	from CursoProgramado
	where IdCiclo = @ciclo
	and IdProfesor = @profesor
	and Activo = 1
end;
go

exec egcc_req_01 '2016-04', 'P014';
go


-- Pregunta 2
/*
Desarrollar un procedimiento que permita
consultar para cada ciclo de un determinado 
periodo, la cantidad de estudiantes 
matriculados y los ingresos proyectados.
*/

alter procedure egcc_req_02( @periodo char(4) )
as
begin
	select 
		IdCiclo, 
		SUM(Matriculados) as Matriculados,
		SUM(Matriculados * PreCursoProg) Ingresos
	from CursoProgramado
	where IdCiclo like @periodo + '%' 
	group by IdCiclo
	order by 1;
end;
go

exec egcc_req_02 '2015';
go


-- Pregunta 3
/*
Realizar un procedimiento que permita 
consultar de cada ciclo de un determinado
periodo, cual es el curso que tiene 
mas estudiantes matriculados.
*/

create procedure egcc_req_03
( @periodo char(4) )
as
begin
	create table #resumen(
	  IdCiclo char(7) null,
	  IdCurso char(4) null,
	  Matriculados int
	);
	
	insert into #resumen(idCiclo,IdCurso,Matriculados)
	select IdCiclo, IdCurso Curso, SUM(Matriculados) Matriculados
	from CursoProgramado
	where idciclo like @periodo + '%'
	group by IdCiclo, IdCurso;

	with v as (
		select IdCiclo, MAX(Matriculados) Matriculados
		from #resumen
		group by IdCiclo)
	select r.IdCiclo, r.IdCurso, c.NomCurso Nombre, r.Matriculados
	from #resumen r 
	inner join v on r.IdCiclo = v.IdCiclo and r.Matriculados = v.Matriculados
	inner join Curso c on r.IdCurso = c.IdCurso 
	order by 1;
end;
go


exec egcc_req_03 '2015';
go




