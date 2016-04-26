<?php
session_start();

$nombre = $_REQUEST["nombre"];

$lista = array();
if( isset($_SESSION["lista"]) ){
  $lista = $_SESSION["lista"];
} 

$lista[] = $nombre;

$_SESSION["lista"] = $lista;

header( 'Location: index.php');

?>