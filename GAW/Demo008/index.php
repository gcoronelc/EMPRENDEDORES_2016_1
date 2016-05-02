<?php
session_start();
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>IDENTIFICACIÓN</h1>
    <form method="post" action="Procesar.php">
      <input type="hidden" name="op" value="1" />
      <label>Nombre:</label><br/>
      <input type="text" name="nombre"/>
      <input type="submit" value="Ingresar" />
    </form>
  </body>
</html>
