<!DOCTYPE html>
<?php
include './lib/libreria.php';

$cuenta = $_REQUEST["cuenta"];

$arreglo = getMovimientos($cuenta);

?>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <?php if(count($arreglo) == 0) {?>
      <p>La cuenta no existe.</p>
    <?php } else { ?>
    
      <table border='1'>
        <tr>
          <th>NRO</th>
          <th>FECHA</th>
          <th>TIPO</th>
          <th>IMPORTE</th>
        </tr>
        
        <?php foreach ( $arreglo as $r) { ?>
        <tr>
          <td><?php echo $r["movinumero"]; ?></td>
          <td><?php echo $r["movifecha"]; ?></td>
          <td><?php echo $r["tiponombre"]; ?></td>
          <td><?php echo $r["moviimporte"]; ?></td>
        </tr>
        <?php } ?>
        
      </table>
      
    <?php } ?>
  </body>
</html>
