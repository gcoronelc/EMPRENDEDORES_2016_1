<?php 
require './lib/libreria.php';

$msg = "";

if (isset($_REQUEST["btnProcesar"])) {
  // Datos
  $usuario = $_REQUEST["usuario"];
  $clave = $_REQUEST["clave"];
  // Proceso
  $code = validar($usuario, $clave);
  if($code == 1){
    header("location: main.php");
  } else {
    $msg = "Datos incorrectos.";
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
    <h1>INICIO DE SESION</h1>
    <p style="color:red; padding: 5px;"><?php echo $msg; ?></p>
    <form method="post" action="index.php">
      Usuario: <input type="text" name="usuario"/><br/>
      Clave: <input type="password" name="clave"/><br/>
      <input type="submit" value="Ingresar" name="btnProcesar"/>
    </form>
  </body>
</html>
