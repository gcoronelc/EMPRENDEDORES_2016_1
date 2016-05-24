<?php
function getConnection() {
  $cn = mysql_connect("localhost", "eureka", "admin");
  $db = mysql_select_db("eurekabank", $cn);
  return $cn;
}

function getCuenta($cuenta) {
  $sql = "select chr_cuencodigo, chr_monecodigo, chr_sucucodigo, 
    chr_emplcreacuenta, chr_cliecodigo, dec_cuensaldo, 
    dtt_cuenfechacreacion, vch_cuenestado, int_cuencontmov, 
    chr_cuenclave from cuenta where chr_cuencodigo = '$cuenta'";
  $cn = getConnection();
  $rs = mysql_query($sql, $cn);
  mysql_close($cn);
  return $rs;
}

function getmovimiento($movimiento){
    $sql="chr_cuencodigo,int_movinumero, dtt_movifecha, chr_emplcodigo, chr_tipocodigo, dec_moviimporte,
chr_cuenreferencia= '$movimiento'";
    return $rs;

}
function  gettipomovimiento($tipomovimiento) {
     $sql="chr_tipocodigo, vch_tipodescripcion, vch_tipoaccion, vch_tipoestado= '$tipomovimiento'";
     
}

