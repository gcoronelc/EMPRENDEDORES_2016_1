/*
Desarrollar una sentencia SELECT para consultar 
los empleados del departamento de contabilidad. 
Base de datos RH.
*/

select * from rh.dbo.departamento;



-- Codigo de contabilidad: 101

select * from rh.dbo.empleado
where iddepartamento = 101;

/*
Desarrolle una sentencia SELECT para consultar 
los cursos programados del ciclo 2013-02 de la 
base de datos EDUTEC.
*/

select  *
from EduTec.dbo.CursoProgramado
where IdCiclo='2013-02';


select * from edutec.dbo.Profesor;

-- Codigo: P002

select * 
from edutec.dbo.CursoProgramado
where IdProfesor = 'P002';


-- 15
select * from Northwind.dbo.Customers;
-- Codigo: ANTON

select * 
from Northwind.dbo.Orders
where CustomerID = 'ANTON';

-- 21

select *
from rh.dbo.empleado
where nombre like '%o';

-- 22
select  *
from rh.dbo.empleado
where apellido like '_[G-Z]%'
and apellido not like '_S%';


select 5 + null;

select * 
from educa.dbo.CURSO
where cur_profesor is null
union 
select * 
from educa.dbo.CURSO
where ltrim(cur_profesor) = '';

select *
from educa.dbo.CURSO
where ltrim(isnull(cur_profesor,''))  = ''





