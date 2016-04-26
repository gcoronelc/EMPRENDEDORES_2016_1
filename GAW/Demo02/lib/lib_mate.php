<?php

function esPrimo($n) {
  $primo = TRUE;
  for ($i = 2; $i < $n; $i++) {
    if($n % $i == 0){
      $primo = FALSE;
      break;
    }
  }
  return $primo;
}

function esPar($n) {
  $par = TRUE;
  if($n % 2 == 1){
    $par = FALSE;
  }
  return $par;
}

function esCapicua($n) {
  $capi = TRUE;
  // Es un reto para el estudiante
  return $capi;
}



?>