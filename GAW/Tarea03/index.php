<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <?php include './cabecera.php'; ?>
    <div id="divWork">
      <p>Pronto seremos expertos en...</p>
    </div>
    <script type="text/javascript" src="jquery/jquery.js"></script>
    <script type="text/javascript">
      function cargarPagina(pagina){
        // La función load carga pagina en divWork utilizando AJAX
        $("#divWork").load(pagina);
      }
    </script>
  </body>
</html>
