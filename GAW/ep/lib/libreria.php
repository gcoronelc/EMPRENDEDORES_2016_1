<?php

$categorias = array(
    "C01"  => "Estudios",
    "C02" => "Tesis");

$productos = array(
    "P01"  => "Pregrado",
    "P02" => "Maestria",
    "P03" => "Doctorado");

function getImporte($cat, $prod){
  $importe = 0.0;
  switch ($cat) {
    
    case "C01": // Estudios
      switch ($prod) {
        case "P01":
          $importe = 10000.0;
          break;
        case "P02":
          $importe = 15000.0;
          break;
        case "P03":
          $importe = 25000.0;
          break;
      }
      break;

    case "C02": // Tesis
      switch ($prod) {
        case "P01":
          $importe = 5000.0;
          break;
        case "P02":
          $importe = 8000.0;
          break;
        case "P03":
          $importe = 12000.0;
          break;
      }
      break;
  }
  
  return $importe;
}

function getFactor($meses){
  $porc = 0.0;
  switch ($meses) {
    case 6:
      $porc = 0.07;
      break;
    case 12:
      $porc = 0.12;
      break;
    case 18:
      $porc = 0.17;
      break;
  }
  return $porc;
}

function getValorCuota($importe, $factor, $meses){
  $valor = ($importe * (1 + $factor) ) / $meses;
  return $valor;
}

?>