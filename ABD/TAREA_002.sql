-- BASE DE DATOS: RRHH

select * from departamento;
go

select * from control;
go

select * from empleado;
go



/*
Requerimiento 01

Procedimiento para registrar un nuevo departamento.
Generar el codigo de la tabla control.
Validar el codigo de la ubicación.

*/




/*
Requerimiento 02

Procedimiento para registrar un nuevo empleado.
El sueldo debe ser el promedio del sueldo minimo 
y sueldo maximo segun el cargo.
El codigo se genera en función a la tabla control.
La comisión es el 50% del sueldo, pero solo para los vendedores.
El jefe es el que ocupa el cargo de gerente en el departamento.
*/





/*
Requerimiento 03

Desarrollar un procedimiento que muestre el importe 
de la planilla por departamento.

COD_DEP    NOMB_DEPT     EMPS      PLANILLA
---------------------------------------------
100        SISTEMAS      20        10,000.00
101        VENTAS        15        25,000.00
---------------------------------------------


*/




