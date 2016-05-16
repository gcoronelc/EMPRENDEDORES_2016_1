<?php require_once './lib/libreria.php'; ?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>BECA DE ESTUDIOS</h1>
    <form method="post" action="procesar.php">
      <table>
        
        <tr>
          <td>Categoria</td>
          <td>
            <select name="cat">
              <option value="C01">Estudios</option>
              <option value="C02">Tesis</option>
            </select>
          </td>
        </tr>
        
        <tr>
          <td>Producto</td>
          <td>
            <select name="prod">
              <?php foreach ($productos as $clave => $valor ) { ?>
              <option value="<?php echo $clave ?>"><?php echo $valor ?></option>
              <?php } ?>
            </select>
          </td>
        </tr>
        
        <tr>
          <td>Meses</td>
          <td>
            <select name="meses">
              <option value="6">6 Meses</option>
              <option value="12">12 Meses</option>
              <option value="18">18 Meses</option>
            </select>
          </td>
        </tr>
        
      </table>
      
      <input type="submit" value="Procesar" />
    </form>
  </body>
</html>
