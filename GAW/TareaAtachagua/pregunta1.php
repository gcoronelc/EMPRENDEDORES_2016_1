<?php
require './lib/libreria.php';
if (isset($_REQUEST["btnProcesar"])) {
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
    <?php include './cabecera.php'; ?>
    <form method="post" action="procesar.php">
      <table>
        <tr>
          <td>SUCURSAL</td>
          <td>
            <select name="sucu">
              <option value="C01">Sipan</option>
              <option value="C02">Chan Cham</option>
              <option value="C03">Los Olivos</option>
              <option value="C04">Pardo</option>
              <option value="C05">Misti</option>
              <option value="C06">Machu Pichu</option>
              <option value="C07">Grau </option>  
            </select>
          </td>
          <td>
            <input type="submit" name="btnProcesar" value="Consultar" />
          </td>
        </tr>                       
      </table>
    </form>

    <?php if (isset($rs) && mysql_num_rows($rs) > 0) { ?>
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

      </form>
      <h2> RESPUESTA</h2>

      <p>sucursal:<?php echo $sucursal; ?> </p>

    <?php } ?> 
</body>
</html>



