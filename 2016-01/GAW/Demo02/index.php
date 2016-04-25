<!DOCTYPE html>
<?php require 'lib/lib_mate.php'; ?>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>ANALISIS DE UN NUMERO</h1>
    <form method="post" action="index.php">
      <p>
        Número:<input type="text" name="num"/> 
        <input type="submit" name="btnProcesar" value="Procesar"/>
      </p>
    </form>
    <?php if(isset($_REQUEST["btnProcesar"])) { ?>
    <h2>RESPUESTA</h2>
    <?php $n = $_REQUEST["num"]; ?>
    <p>Número: <?php echo $n; ?></p>
    <p>Es Primo: <?php echo esPrimo($n)?"SI":"NO"; ?></p>
    <p>Es Par: <?php echo esPar($n)?"SI":"NO"; ?></p>
    <p>Es Capicúa: <?php echo esCapicua($n)?"SI":"NO"; ?></p>
    <?php } ?>
  </body>
</html>
