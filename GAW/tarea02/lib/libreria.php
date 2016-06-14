<?php
function getConnection() {
  $cn = mysql_connect("localhost", "recursos", "admin");
  $db = mysql_select_db("RECURSOS", $cn);
  return $cn;
}

function validar($usuario, $clave){
  $cn = getConnection();
  $sql = "select count(*) cont from usuario "
          . "where usuario='$usuario' "
          . "and clave=SHA('$clave')";
  $rs = mysql_query($sql, $cn);
  $cont = mysql_result($rs, 0, 0);
  $rpta = -1;
  if($cont == 1){
    $rpta = 1;
  }
  return $rpta;
}

function getDepartamentos(){
  $cn = getConnection();
  $sql = "select iddepartamento code, nombre
          from departamento 
          where iddepartamento in (
            select distinct iddepartamento from empleado)";
  $rs = mysql_query($sql, $cn);
  return $rs;
}

function getEmpPorDep($codDep){
  $cn = getConnection();
  $sql = "select idempleado, apellido, nombre,
    fecingreso, email, telefono, 
    idcargo, iddepartamento, sueldo,
    comision, jefe from empleado
    where iddepartamento = $codDep";
  $rs = mysql_query($sql);
  $arrayEmps = rsToArray($rs);
  return $arrayEmps;
}

function getDepartamento($codDep){
  $cn = getConnection();
  $sql = "select iddepartamento code, nombre
          from departamento 
          where iddepartamento = $codDep";
  $rs = mysql_query($sql, $cn);
  if(mysql_num_rows($rs) === 0){
    $arrayDep = array();
  } else {
    $arrayDep = mysql_fetch_assoc($rs);
  }
  return $arrayDep;
}

function rsToArray($rs){
  $array = array();
  while($row = mysql_fetch_array($rs)) {
    $array[] = $row;
  }
  return $array;
}

?>