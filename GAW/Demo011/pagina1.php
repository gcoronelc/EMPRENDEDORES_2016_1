<?php
  require './lib/libreria.php';
  if( isset($_REQUEST["btnProcesar"]) ){
    // Dato
    $cuenta = $_REQUEST["cuenta"];
    // Proceso
    $rs = getCuenta($cuenta);
  }
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <?php include './cabecera.php';    ?>
    <h2>CONSULTA CUENTA</h2>
    <form method="post" action="pagina1.php">
      <p>
        Cuenta:
        <input type="text" name="cuenta" />
        <input type="submit" name="btnProcesar" value="Procesar" />
      </p>
    </form>
    
    <?php if(isset($rs) && mysql_num_rows($rs) > 0){ ?>
      <h2>RESULTADO</h2>
      <table>
        <tr>
          <td>CUENTA</td>
          <td><?php echo mysql_result($rs, 0, "chr_cuencodigo") ?></td>
        </tr>
        <tr>
          <td>MONEDA</td>
          <td><?php echo mysql_result($rs, 0, "chr_monecodigo") ?></td>
        </tr>
        <tr>
          <td>SALDO</td>
          <td><?php echo mysql_result($rs, 0, "dec_cuensaldo") ?></td>
        </tr>
      </table>
    <?php } ?>
    
  </body>
</html>
