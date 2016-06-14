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

function getDepartamentosTodos(){
  $cn = getConnection();
  $sql = "select iddepartamento code, nombre
          from departamento";
  $rs = mysql_query($sql, $cn);
  $arrayDeps = rsToArray($rs);
  return $arrayDeps;
}

function getCargosTodos(){
  $cn = getConnection();
  $sql = "select idcargo code, nombre
          from cargo";
  $rs = mysql_query($sql, $cn);
  $arrayDeps = rsToArray($rs);
  return $arrayDeps;
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

function grabarEmpleado($datos){
  $cn = getConnection();
  mysql_query("begin work",$cn);
  // Sueldo mdel empleado
  $sql = "select (sueldo_min + sueldo_max) / 2 "
          . "sueldo from cargo "
          . "where idcargo = '" . $datos["codCargo"] . "'";
  $rs = mysql_query($sql, $cn);
  $sueldo = mysql_result($rs, 0, 0);
  // Codigo
  $sql = "select valor from control "
          . "where parametro = 'Empleado' "
          . "for update ";
  $rs = mysql_query($sql, $cn);
  $cont = mysql_result($rs, 0, 0);
  $cont = $cont + 1;
  $sql = "update control set valor = '$cont' "
          . "where parametro = 'Empleado' ";
  mysql_query($sql, $cn);
  $codigo = "E" . str_pad($cont, 4, "0", STR_PAD_LEFT);
  // Comisión
  $comi = 0.0;
  if($datos["codCargo"] == "C05"){
    $comi = $sueldo * 0.5;
  }
  // Jefe
  $sql = "select idempleado from empleado "
          . "where idcargo in ('C01','C02') "
          . "and iddepartamento = " . $datos["codDep"];
  $rs = mysql_query($sql,$cn);
  $jefe = mysql_result($rs, 0, 0);
  // Insertar dato
  $sql = "insert into empleado(idempleado,apellido,nombre,
    fecingreso,email,telefono,idcargo,iddepartamento,
    sueldo,comision,jefe) values('{$codigo}',
    '{$datos['apellido']}','{$datos['nombre']}',
    '{$datos['fecha']}','{$datos['email']}',
    '{$datos['telefono']}','{$datos['codCargo']}',
    '{$datos['codDep']}',{$sueldo},{$comi},'{$jefe}')";
  echo "SQL:" . $sql;
  mysql_query($sql, $cn);
  // Confirmar Tx
  mysql_query("commit",$cn);
  return 1;
}


function rsToArray($rs){
  $array = array();
  while($row = mysql_fetch_array($rs)) {
    $array[] = $row;
  }
  return $array;
}

?>