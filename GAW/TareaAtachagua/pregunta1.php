<?php
require './lib/libreria.php';

$rsSucu = getSucursales();           // ResultSet de sucursales
$cantSucu = mysql_num_rows($rsSucu); // Cantidad de sucursales

if (isset($_REQUEST["btnProcesar"])) {
  // Dato
  $sucu = $_REQUEST["sucu"];
  // Proceso
  $rsCuentas = getResumenCuentas($sucu);
  $cantCuentas = mysql_num_rows($rsCuentas);
  echo $cantCuentas;
}

?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <?php include './cabecera.php'; ?>
    <form method="post" action="pregunta1.php">
      <table>
        <tr>
          <td>SUCURSAL</td>
          <td>
            <select name="sucu">
              <?php for($i = 0; $i < $cantSucu; $i++) { ?>
              <option value="<?php echo mysql_result($rsSucu, $i, 'codigo'); ?>">
                <?php echo mysql_result($rsSucu, $i, 'codigo'); ?> - 
                <?php echo mysql_result($rsSucu, $i, 'nombre'); ?>
              </option>
              <?php } ?>
            </select>
          </td>
          <td>
            <input type="submit" name="btnProcesar" value="Consultar" />
          </td>
        </tr>                       
      </table>
    </form>
    
    <?php if( isset($rsCuentas) && $cantCuentas == 0) { ?>
      <h2>RESULTADO</h2>
      <p>sucursal:<?php echo $sucu; ?> </p>
      <p>No tiene cuentas.</p>
    <?php } ?> 
    

    <?php if( isset($rsCuentas) && $cantCuentas > 0) { ?>
      <h2>RESULTADO</h2>
      <p>sucursal:<?php echo $sucu; ?> </p>
      <table boder='1'>
        <tr>
          <td>CUENTA</td>
          <td>INGRESO</td>
          <td>SALIDA</td>
          <td>SALDO</td>
        </tr>
        
        <?php for($i = 0; $i < $cantCuentas; $i++) { ?>
        <tr>
          <td><?php echo mysql_result($rsCuentas, 0, "cuenta") ?></td>
          <td><?php echo mysql_result($rsCuentas, 0, "ingreso") ?></td>
          <td><?php echo mysql_result($rsCuentas, 0, "salida") ?></td>
          <td><?php echo mysql_result($rsCuentas, 0, "saldo") ?></td>
        </tr>
        <?php } ?>

    <?php } ?> 
</body>
</html>



