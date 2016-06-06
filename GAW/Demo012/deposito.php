<?php
require './lib/libreria.php';

$msg = "";

if (isset($_REQUEST["btnProcesar"])) {
  // Dato
  $cuenta = $_REQUEST["cuenta"];
  $importe = $_REQUEST["importe"];
  // Proceso
  procDeposito($cuenta, $importe, '0008');
  $msg = "Proceso ejecutado correctamente";
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
    <form method="post" action="deposito.php">
      <table>
        <tr>
          <td>CUENTA</td>
          <td>
            <input type="text" name="cuenta"/>
          </td>
          <td>
          </td>
        </tr>
        <tr>
          <td>IMPORTE</td>
          <td>
            <input type="number" name="importe"/>
          </td>
          <td>
            <input type="submit" name="btnProcesar" value="Procesar" />
          </td>
        </tr>                       
      </table>
    </form>
    
    

    <?php if( $msg ) { ?>
      <p><?php echo $msg; ?></p>
    <?php } ?> 
</body>
</html>



