<?php
session_start();

if(!isset($_REQUEST["op"])){
  header("location: index.php");
  return;
}

$op = $_REQUEST["op"];

if($op == 1){ // Ingreso
  fnIngreso();
  return;
} elseif ($op == 2) { // Agregar
  fnAgregar();
  return;
} elseif ($op == 3) { // Limpiar Lista
  fnLimpiar();
  return;
} elseif ($op == 4) { // Limpiar Lista
  fnCerrar();
  return;
} elseif ($op == 5) { // Limpiar Lista
  fnEliminar();
  return;
}

return;

function fnEliminar() {
  // Obtener la clave
  $key = $_REQUEST["key"];
  // Obtener el catalogo
  $catalogo = $_SESSION["catalogo"];
  // Eliminar elemento
  unset($catalogo[$key]);
  // Actualizar sesión
  $_SESSION["catalogo"] = $catalogo;
  // Retornar a la lista
  header("location: listado.php");
}

function fnCerrar() {
  session_destroy();
  header("location: index.php");
}

function fnLimpiar() {
  $_SESSION["catalogo"] = array();
  header("location: listado.php");
}


function fnIngreso() {
  $destino = "";
  $nombres  = "Claudia,Carlos,Gilberto,No Recuerdo,";
  $nombre = $_REQUEST["nombre"];
  if( strpos($nombres, $nombre) !== FALSE){
    $_SESSION["nombre"] = $nombre;
    $destino = "main.php";
  } else {
    $msgError = "Dato incorrecto.";
    $destino = "index.php?error=$msgError";
  }
  header("location: $destino");
}

function fnAgregar() {
  // Datos
  $nombre = $_REQUEST["nombre"];
  $precio = $_REQUEST["precio"];
  // Agregar a catalogo
  $catalogo = array();
  if(isset($_SESSION["catalogo"])){
    $catalogo = $_SESSION["catalogo"];
  } 
  $catalogo["$nombre"] = $precio;
  $_SESSION["catalogo"] = $catalogo;
  header("location: listado.php");
}

?>