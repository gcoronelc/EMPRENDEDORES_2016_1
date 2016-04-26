<?php require_once './lib/libreria.php'?>;
<?php
// Datos
$horasDia = $_REQUEST["horasDia"];
$dias = $_REQUEST["dias"];
$pagoHora = $_REQUEST["pagoHora"];
// Proceso
$ingresos = calcIngresos($horasDia, $dias, $pagoHora);
$renta = calcRenta($ingresos);
$neto = calcNeto($ingresos);
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>REPORTE DE PAGO</h1>
    <p>INGRESOS: <?php echo $ingresos ?></p>
    <p>RENTA: <?php echo $renta ?></p>
    <p>NETO: <?php echo $neto ?></p>
    <p><a href="index.php">Retornar</a></p>
  </body>
</html>
