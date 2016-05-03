<h1>DEMO DE SESIONES</h1>
<p>Nombre: <?php echo $_SESSION["nombre"] ?></p>
<p>
  <a href="agregar.php">Agregar</a>&nbsp;&nbsp;<!-- dos espacios -->
  <a href="listado.php">Listar</a>&nbsp;&nbsp;
  <a href="procesar.php?op=3">Limpiar Lista</a>&nbsp;&nbsp;
  <a href="procesar.php?op=4">CerrarSesion</a>&nbsp;&nbsp;
</p>