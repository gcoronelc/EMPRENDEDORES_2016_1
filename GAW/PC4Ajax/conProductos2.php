<?php
include './lib/libreria.php';

$cat = $_REQUEST["cat"];
$arrayProds = getProductos($cat);

?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h2>LISTADO DE PRODUCTOS</h2>
    <table border="1">
      <tr>
        <th>CODE</th>
        <th>PRODUCTO</th>
        <th>CATEGORIA</th>
        <th>PRECIO</th>
        <th>STOCK</th>
      </tr>
      
      <?php foreach ($arrayProds as $r) {?>
      <tr>
        <td><?php echo $r["code"] ?></td>
        <td><?php echo $r["producto"] ?></td>
        <td><?php echo $r["categoria"] ?></td>
        <td><?php echo $r["precio"] ?></td>
        <td><?php echo $r["stock"] ?></td>
      </tr>
      <?php } ?>
      
    </table>
  </body>
</html>
