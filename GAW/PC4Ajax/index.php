<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>EMPRENDEDORES 2016</h1>
    <h3>GAW - Práctica 04 con AJAX</h3>
    <p>Profesor: Gustavo Coronel</p>
    <hr/>
    <a href="javascript: cargaPagina('conProductos.php');">Consulta de Productos</a>&nbsp;&nbsp;
    <a href="#">Nuevo Producto</a>&nbsp;&nbsp;
    <hr/>
    <div id="divWORK" style="border-color: blue;
         border-style: solid; border-width: 2px;">
      <br/>
      <br/>
      <br/>
      <p>Esta es el área de trabajo.</p>
      <br/>
      <br/>
    </div>
    <script type="text/javascript" src="jquery/jquery.js"></script>
    <script type="text/javascript">
    
      function cargaPagina(pagina){
        $("#divWORK").load(pagina);
      }
    
    
    </script>
  </body>
</html>
