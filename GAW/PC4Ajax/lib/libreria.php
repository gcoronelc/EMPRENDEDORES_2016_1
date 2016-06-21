<?php
function getConnection() {
  $cn = mysql_connect("localhost", "ventas", "admin");
  $db = mysql_select_db("VENTAS", $cn);
  //mysql_query("SET NAMES 'utf8'", $cn);
  mysql_query("SET character_set_results=utf8", $cn);
  return $cn;
}


function getCategorias(){
  $cn = getConnection();
  $sql = "select idcat code, nombre from categoria
    where idcat in (
    select distinct idcat from producto)";
  $rs = mysql_query($sql, $cn);
  $lista = rsToArray($rs);
  return $lista;
}

function getProductos($cat){
  $cn = getConnection();
  $sql = "select p.idprod code, p.nombre producto,
      c.nombre categoria, p.precio, p.stock
      from categoria c
      join producto p on c.idcat = p.idcat
      where c.idcat = $cat";
  $rs = mysql_query($sql, $cn);
  $arrayProds = rsToArray($rs);
  return $arrayProds;
}

function rsToArray($rs){
  $array = array();
  while($row = mysql_fetch_array($rs)) {
    $array[] = $row;
  }
  return $array;
}

?>