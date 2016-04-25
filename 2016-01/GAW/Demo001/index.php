<!DOCTYPE html>
<?php
  if( isset($_REQUEST["btnProcesar"]) ){
    // Datos
    $n1 = $_REQUEST["num1"];
    $n2 = $_REQUEST["num2"];
    // Proceso
    $suma = $n1 + $n2;
  }
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
      <h1>SUMAR</h1>
      <form method="POST" action="index.php">
        <fieldset style="width: 300px;">
          <p>Número 1: <input type="text" name="num1"/></p>
          <p>Número 2: <input type="text" name="num2"/></p>
          <p><input type="submit" name="btnProcesar" value="Procesar"/></p>
        </fieldset>
      </form>
      <?php if( isset($_REQUEST["btnProcesar"]) ){ ?>
      <h2>RESULTADO</h2>
      <fieldset style="width: 300px;">
        <p>Número 1: <?php echo $n1; ?></p>
        <p>Número 2: <?php echo $n2; ?></p>
        <p>Suma: <?php echo $suma; ?></p>
      </fieldset>
      <?php } ?>
    </body>
</html>
