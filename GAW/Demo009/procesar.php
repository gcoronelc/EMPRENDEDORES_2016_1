<?php

// Datos
$valor1 = $_REQUEST["valor1"];
$valor2 = $_REQUEST["valor2"];

$consumo = fnConsumo($valor1,$valor2);
$importe = fnImporte($consumo);

include_once 'resultado.php';

return;

function fnConsumo($valor1, $valor2) {
  return ($valor2 - $valor1);
}

function fnImporte($consumo) {
  $importe = 0.0;
  $precios = array(0.70,0.85,1.15,1.50,2.50);
  $limites = array(0,500,1000,1500,2000,);
  $tope = count($precios) - 1;
  for ($i = 0; $i <= $tope; $i++) {
    if( $i < $tope ){
       if($consumo > $limites[$i]){
        if( $consumo < $limites[$i + 1]){
          $auxiliar = $consumo - $limites[$i];
        } else {
          $auxiliar = $limites[$i + 1] - $limites[$i];
        }
        $importe = $auxiliar * $precios[$i];
      }
    } else {
      $importe += ($consumo - $limites[$i]) * $precios[$i];
    }
  }
  Return $importe;
}

?>