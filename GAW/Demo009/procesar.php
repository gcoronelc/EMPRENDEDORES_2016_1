<?php

// Datos
$valor1 = $_REQUEST["valor1"];
$valor2 = $_REQUEST["valor2"];

$consumo = fnConsumo($valor1, $valor2);
$importe = fnImporte($consumo);

include_once 'resultado.php';

return;

function fnConsumo($valor1, $valor2) {
  return ($valor2 - $valor1);
}

function fnImporte($consumo) {
  $importe = 0.0;
  $precios = array(0.70, 0.85, 1.15, 1.50, 2.50);
  $limites = array(500, 500, 500, 500, 0);
  $i = 0;
  $tope = count($precios) - 1;
  while ($consumo > 0 && $i <= $tope) {
    echo "i = $i<br/>";
    if ($consumo > $limites[$i] && $i < $tope) {
      $kwh = $limites[$i];
    } else {
      $kwh = $consumo;
    }
    $importe += $kwh * $precios[$i];
    $consumo -= $limites[$i];
    $i++;
  }
  return $importe;
}
