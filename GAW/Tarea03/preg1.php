<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h3>CONSULTA DE MOVIMIENTOS</h3>
    <form id="form1">
      Cuenta: 
      <input type="text" name="cuenta" id="cuenta"/>
      <input type="button" id="btnConsultar" value="Consultar" />
    </form>
    <br/>
    <div id="divResultado">
      Aquí se mostrará el resultado.
    </div>
    <script type="text/javascript">
      
      $("#btnConsultar").click(function(){
        
        var data = $("#form1").serialize();
        $.post("preg1Rpta.php",data,function(pagHTML){
          $("#divResultado").html(pagHTML);
        });
        
      });
      
      
    </script>
  </body>
</html>
