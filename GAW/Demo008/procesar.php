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
}

return;

function fnCerrar() {
  session_destroy();
  header("location: index.php");
}

function fnLimpiar() {
  $_SESSION["catalogo"] = array();
  header("location: listado.php");
}


function fnIngreso() {
  $nombre = $_REQUEST["nombre"];
  $_SESSION["nombre"] = $nombre;
  header("location: main.php");
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