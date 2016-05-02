<?php
session_start();

require_once './seguridad.php';
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <?php require_once './cabecera.php'; ?>
    <h3>AGREGAR PRODUCTO</h3>
    <form method="post" action="procesar.php">
      <input type="hidden" name="op" value="2" />
      <table>
        <tr>
          <td>Nombre:</td>
          <td><input type="text" name="nombre"/></td>
        </tr>
        <tr>
          <td>Precio:</td>
          <td><input type="text" name="precio"/></td>
        </tr>
      </table>
      <input type="submit" value="Procesar"/>
    </form>
  </body>
</html>
