<?php
function getConnection() {
  $cn = mysql_connect("localhost", "eureka", "admin");
  $db = mysql_select_db("eurekabank", $cn);
  return $cn;
}

function getSucursales(){
  $sql = "select chr_sucucodigo codigo, 
          vch_sucunombre nombre from sucursal";
  $cn = getConnection();
  $rs = mysql_query($sql,$cn);
  mysql_close($cn);
  return $rs;
}

function getResumenCuentas( $sucu ){
  $sql = "select 
      m.chr_cuencodigo AS cuenta,
      sum(case when tm.vch_tipoaccion='INGRESO' 
        then dec_moviimporte else 0 end) as ingreso,
      sum(case when tm.vch_tipoaccion='SALIDA' 
        then dec_moviimporte else 0 end) as salida,
      sum(dec_moviimporte * case when tm.vch_tipoaccion='SALIDA' 
        then -1 else 1 end) as saldo
    from tipomovimiento tm
    join movimiento m on tm.chr_tipocodigo = m.chr_tipocodigo
    join cuenta c on m.chr_cuencodigo = c.chr_cuencodigo
    where c.chr_sucucodigo = '$sucu'
    group by m.chr_cuencodigo ";
  $cn = getConnection();
  $rs = mysql_query($sql,$cn);
  mysql_close($cn);
  return $rs;
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

