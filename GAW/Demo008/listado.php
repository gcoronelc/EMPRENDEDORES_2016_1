<?php
  session_start();
  
  require_once './seguridad.php';
  
  $catalogo = $_SESSION["catalogo"];
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <?php require_once './cabecera.php'; ?>
    <h3>LISTADO</h3>
    <table  >
      <tr>
        <th style="border: 1px #6E6E6E solid; width: 100px;">NOMBRE</th>
        <th style="border: 1px #6E6E6E solid; width: 100px;">PRECIO</th>
        <th style="border: 1px #6E6E6E solid; width: 100px;">ACCION</th>
      </tr>
      
      <?php foreach ($catalogo as $key => $value) {?>
      <tr>
        <td style="border: 1px #6E6E6E solid;"><?php echo $key; ?></td>
        <td style="border: 1px #6E6E6E solid;"><?php echo $value; ?></td>
        <td style="border: 1px #6E6E6E solid;">
          <a href="procesar.php?op=5&key=<?php echo $key; ?>">Eliminar</a>
        </td>
      </tr>
      <?php } ?>
      
    </table>
  </body>
</html>
