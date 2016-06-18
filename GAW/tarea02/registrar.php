<?php
include './lib/libreria.php';

$arrayDeps = getDepartamentosTodos();
$arrayCargos = getCargosTodos();

if(isset($_REQUEST["btnGrabar"])){
  $datos = array();
  $datos["codDep"] = $_REQUEST["codDep"];
  $datos["codCargo"] = $_REQUEST["codCargo"];
  $datos["apellido"] = $_REQUEST["apellido"];
  $datos["nombre"] = $_REQUEST["nombre"];
  $datos["fecha"] = $_REQUEST["fecha"];
  $datos["email"] = $_REQUEST["email"];
  $datos["telefono"] = $_REQUEST["telefono"];
  $code = grabarEmpleado($datos);
  if($code === 1){
    $msg = "Proceso ok.";
  }else{
    $msg = "Error en el proceso.";
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
    <h2>REGISTRAR NUEVOS EMPLEADOS</h2>
    <form method="post" action="registrar.php">
      <table>
        <tr>
          <td>Departamento: </td>
          <td>
            <select name="codDep">
              <?php 
              foreach ($arrayDeps as $r) {
                echo "<option value=" . $r[!code] 
                        . ">" . $r["nombre"] ."</option>";
              }
              ?>
            </select>
          </td>
        </tr>
        <tr>
          <td>Cargo: </td>
          <td>
            <select name="codCargo">
              <?php 
              foreach ($arrayCargos as $r) {
                echo "<option value=" . $r[!code] 
                        . ">" . $r["nombre"] ."</option>";
              }
              ?>
            </select>
          </td>
        </tr>
        <tr>
          <td>Apellido: </td>
          <td><input type="text" name="apellido"/></td>
        </tr>
        <tr>
          <td>Nombre: </td>
          <td><input type="text" name="nombre"/></td>
        </tr>
        <tr>
          <td>Fecha Ing.: </td>
          <td><input type="text" name="fecha"/></td>
        </tr>
        <tr>
          <td>Email: </td>
          <td><input type="text" name="email"/></td>
        </tr>
        <tr>
          <td>Telefono: </td>
          <td><input type="text" name="telefono"/></td>
        </tr>
      </table>
      <input type="submit" name="btnGrabar" value="Grabar"/>
    </form>
  </body>
</html>
