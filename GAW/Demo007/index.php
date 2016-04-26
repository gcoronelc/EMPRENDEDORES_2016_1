<?php session_start(); ?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>LISTA DE NOMBRES</h1>
    <form method="post" action="procesar.php">
      <p>
        Nombre:
        <input type="text" name="nombre"/>
        <input type="submit" value="Procesar"/>
      </p>
    </form>
    
    <ol>
    <?php if( isset($_SESSION["lista"]) ) { ?>
      
      <?php foreach ($_SESSION["lista"] as $value) { ?>
        <li><?php echo $value; ?></li>
      <?php  } ?>
      
    <?php } ?>
    </ol>
  </body>
</html>
