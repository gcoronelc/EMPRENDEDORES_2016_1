<?php
include './lib/libreria.php';

$usuario = $_REQUEST["usuario"];
$clave = $_REQUEST["clave"];

$code = validar($usuario, $clave);

if($code === 1){
  include './main.php';
} else {
  $msg = "Datos incorrectos.";
  include './index.php';
}

?>