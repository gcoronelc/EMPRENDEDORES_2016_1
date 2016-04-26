<?php

function calcIngresos($horasDia, $dias, $pagoHora) {
  $ingresos = $horasDia * $dias * $pagoHora;
  return $ingresos;
}

function calcRenta($ingresos) {
  $renta = "no se";
  return $renta;
}

function calcNeto($ingresos) {
  $neto = "nose";
  return $neto;
}
?>