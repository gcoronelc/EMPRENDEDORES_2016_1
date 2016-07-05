<?php

function getConnection() {
  $cn = mysql_connect("localhost", "eureka", "admin");
  $db = mysql_select_db("EUREKABANK", $cn);
  return $cn;
}

function rsToArray($rs){
  $array = array();
  while($row = mysql_fetch_array($rs)) {
    $array[] = $row;
  }
  return $array;
}

function getMovimientos($cuenta){
  $cn = getConnection();
  $sql = "select   
          CUENCODIGO, MONENOMBRE, CUENSALDO, CUENESTADO,  
          MOVINUMERO, MOVIFECHA, MOVIIMPORTE, TIPOCODIGO, TIPONOMBRE  
          from v_movimiento
          where CUENCODIGO = '$cuenta' 
          limit 3";
  $rs = mysql_query($sql, $cn);
  $arreglo = rsToArray($rs);
  return $arreglo;
}

function crearCuenta($codCli, $codMoneda, $importe, $clave, $codEmp){
  // Obtener conexión
  $cn = getConnection();
  if(!$cn){
    return "Error en el acceso a la base de datos.";
  }
  // Inicio de Tx
  mysql_query("begin work",$cn);
  // Obtener la sucursal
  $sql = "select chr_sucucodigo from asignado "
          . "where chr_emplcodigo='$codEmp' and dtt_asigfechabaja is null";
  $rs = mysql_query($sql,$cn);
  $filas = mysql_num_rows($rs);
  if($filas == 0){
    mysql_query("rollback",$cn);
    return "Error, el empleado no esta autorizado.";
  }
  $codSucu = mysql_result($rs, 0, 0);
  // Obtener contador
  $sql = "select int_sucucontcuenta from sucursal "
          . "where chr_sucucodigo='$codSucu'";
  $rs = mysql_query($sql,$cn);
  $cont = mysql_result($rs, 0, 0);
  $sql = "update sucursal 
          set int_sucucontcuenta = int_sucucontcuenta + 1 
          where chr_sucucodigo='$codSucu' ";
  mysql_query($sql,$cn);
  // Generar código de cuenta
  $cont++;
  $codigo = $codSucu . str_pad($cont,5,"0",STR_PAD_LEFT);
  // registrar la cuenta
  $sql = "insert into cuenta(chr_cuencodigo,chr_monecodigo,chr_sucucodigo,
    chr_emplcreacuenta,chr_cliecodigo,dec_cuensaldo,dtt_cuenfechacreacion,
    vch_cuenestado,int_cuencontmov,chr_cuenclave) values('$codigo',
    '$codMoneda','$codSucu','$codEmp','$codCli',$importe,
    sysdate(),'ACTIVO',1,'$clave')";
  mysql_query($sql, $cn);
  if(mysql_errno($cn) != 0){
    mysql_query("rollback",$cn);
    return "Error en el proceso, revise sus datos.";
  }
  // Insertar el movimiento
  $sql = "insert into movimiento(chr_cuencodigo,int_movinumero,
    dtt_movifecha,chr_emplcodigo,chr_tipocodigo,dec_moviimporte) 
    values('$codigo',1,SYSDATE(),'$codEmp','001',$importe)";
  mysql_query($sql, $cn);
  if(mysql_errno($cn) != 0){
    mysql_query("rollback",$cn);
    return "Error en el proceso, revise sus datos.";
  }
  // Confirmar Tx
  mysql_query("commit");
  return "OK";
}


$texto = crearCuenta("00015", "01", 5000.0, "666666", "0004");

echo $texto;




?>