<?php
include './lib/libreria.php';
$lstCat = getCategorias();
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h2>CONSULTAR PRODUCTOS</h2>
    <form id="form1">
    <p>
      Categoría:
      <select id="cat" name="cat">
        <option value="0">Seleccionar</option>
        <?php
        foreach ($lstCat as $r) {
          echo "<option value='{$r['code']}'>{$r['nombre']}</option>";
        }
        ?>
      </select>
      <input type="button" id="btnConsultar" value="Consultar"/>
    </p>
    </form>
    <div id="divResultado">Aquí se mostrará el resultado</div>
    <script type="text/javascript">
    
      $("#btnConsultar").click(function(){
        var cat = $("#cat").val();
        if(cat == 0){
          alert("Seleccione una categoría.");
          return;
        }
        var data = $("#form1").serialize();
        $.post("conProductos2.php",data,function(pagTabla){
          $("#divResultado").hide(1000);
          $("#divResultado").html(pagTabla);
          $("#divResultado").show("slow");
        });
      });
    
    </script>
  </body>
</html>
