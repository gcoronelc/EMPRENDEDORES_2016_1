<?php

function fn_tabla($n) {
  $tabla  = array();
  for ($i = 1; $i <= 12; $i++) {
    $fila["n1"] = $n;
    $fila["n2"] = $i;
    $fila["r"] = $n * $i;
    $tabla[] = $fila;
  }
  return $tabla;
}

?>
