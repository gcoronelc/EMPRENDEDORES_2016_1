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
