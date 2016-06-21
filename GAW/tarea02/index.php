<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>INICIO DE SESIÓN</h1>
    
    <?php if(isset($msg)) { ?>
    <p class="egcc_error"><?php echo $msg ?></p>
    <?php } ?>
      
    <form method="post" action="logon.php">
      <p>Usuario: <input type="text" name="usuario"/></p>
      <p>Clave: <input type="password" name="clave"/></p>
      <p><input type="submit" value="Ingresar"/></p>
    </form>
  </body>
</html>
