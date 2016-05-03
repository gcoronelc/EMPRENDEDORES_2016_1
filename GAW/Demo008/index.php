<?php
session_start();

if("1" === 1){
  echo "Bayer campeon";
}
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>IDENTIFICACIÓN</h1>
    <?php if( isset( $_REQUEST["error"] ) ){ ?>
    <p style="border: 1px red solid; color: red; padding: 10px; width: 300px;">
      <?php echo $_REQUEST["error"]; ?>
    </p>
    <?php } ?>
    <form method="post" action="Procesar.php">
      <input type="hidden" name="op" value="1" />
      <label>Nombre:</label><br/>
      <input type="text" name="nombre"/>
      <input type="submit" value="Ingresar" />
    </form>
  </body>
</html>
