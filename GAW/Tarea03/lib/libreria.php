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












?>