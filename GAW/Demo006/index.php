<?php
  require_once './lib/mate.php';
  $tabla = array(); 
  if(isset($_REQUEST["btnProcesar"])){
    // datos
    $n = $_REQUEST["n"];
    // Proceso
    $tabla = fn_tabla($n);
  }

?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>TABLA DE MULTIPLICAR</h1>
    <form method="post" action="index.php">
      <p>
         Tabla del: 
         <select name="n">
           <?php for ($i = 1; $i <= 12; $i++) { ?>
           <option value="<?php echo $i; ?>"><?php echo $i; ?></option>
           <?php } ?>
           <input type="submit" name="btnProcesar" value="Procesar" />
         </select>
      </p>
    </form>
    
    <?php if(isset($_REQUEST["btnProcesar"])) { ?>
    <h2>TABLA DEL <?php echo $n; ?></h2>
    <table border="1" width="200">
      <?php foreach ($tabla as $fila) {?>
      <tr>
        <td><?php echo $fila["n1"] ?></td>
        <td>*</td>
        <td><?php echo $fila["n2"] ?></td>
        <td>=</td>
        <td><?php echo $fila["r"] ?></td>
      </tr>
      <?php } ?>
    </table>
    <?php } ?>
    
  </body>
</html>
