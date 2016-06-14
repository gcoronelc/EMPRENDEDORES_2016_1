<?php
  include './lib/libreria.php';
  $rsDep = getDepartamentos();
  $filas = mysql_num_rows($rsDep);
  
  if( isset($_REQUEST["btnConsultar"]) ){
    $codDep = $_REQUEST["codDep"];
    if($codDep <> 0){
      $arrayDep = getDepartamento($codDep);
      $arrayEmps = getEmpPorDep($codDep);
    }
  }
  
?>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <?php include './cabecera.php'; ?>
    <h2>CONSULTA 1</h2>
    <form>
      Departamento:
      <select name="codDep">
        <option value="0">Seleccione</option>
        <?php for( $i = 0; $i < $filas; $i++ ) { ?>
        <option value="<?php echo mysql_result($rsDep, $i, 0) ?>">
            <?php echo mysql_result($rsDep, $i, 1) ?>
        </option>
        <?php } ?>
      </select>
      <input type="submit" name="btnConsultar" value="Consultar"/>
    </form>
    
    <?php if( isset($arrayEmps)) { ?>
      <h2>RESULTADO</h2>
      
      <?php 
      if($arrayDep){
       echo "<p>" . $arrayDep["code"] . " - " 
               .  $arrayDep["nombre"] . "</p>";
      }
      ?>
      
      <table border="1">
        
        <tr>
          <th>CODIGO</th>
          <th>APELLIDO</th>
          <th>NOMBRE</th>
          <th>FEC.ING.</th>
        </tr>
        
        <?php foreach ($arrayEmps as $row) { ?>
        <tr>
          <td><?php echo $row["idempleado"]; ?></td>
          <td><?php echo $row["apellido"]; ?></td>
          <td><?php echo $row["nombre"]; ?></td>
          <td><?php echo $row["fecingreso"]; ?></td>
        </tr>
        <?php } ?>

      </table>
    <?php } ?>
  </body>
</html>
