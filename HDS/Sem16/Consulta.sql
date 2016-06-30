select cp.IdCursoProg id, cp.IdCurso idcurso, 
	c.NomCurso nomcurso, cp.Horario, cp.Matriculados,
	isnull(cp.IdProfesor,'NONE') idprofesor,
	isnull(p.NomProfesor,'NONE') nomprofesor
from CursoProgramado cp
join Curso c on cp.IdCurso = c.IdCurso
left join profesor p on cp.IdProfesor = p.IdProfesor
where IdCiclo = '2016-05';




