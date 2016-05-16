<?php 
  
  require_once './lib/libreria.php';

  // Datos
  $cat = $_REQUEST["cat"];
  $prod = $_REQUEST["prod"];
  $meses = $_REQUEST["meses"];

  // Proceso
  $importe = getImporte($cat, $prod);
  $factor = getFactor($meses);
  $valorCuota = getValorCuota($importe, $factor, $meses);
  $porc = $factor * 100;
  
?>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>RESULTADO DEL PROCESO</h1>
    <table>
      <tr>
        <td>Categoria</td>
        <td><?php echo $categorias[$cat]; ?></td>
      </tr>
      <tr>
        <td>Producto</td>
        <td><?php echo $productos[$prod]; ?></td>
      </tr>
      <tr>
        <td>Importe</td>
        <td><?php echo $importe; ?></td>
      </tr>
      <tr>
        <td>Meses</td>
        <td><?php echo $meses; ?></td>
      </tr>
      <tr>
        <td>Porcentaje</td>
        <td><?php echo $porc; ?></td>
      </tr>
      <tr>
        <td>Valor cuota</td>
        <td><?php echo $valorCuota; ?></td>
      </tr>
      
    </table>
    
    <a href="index.php">Retornar</a>
  </body>
</html>
