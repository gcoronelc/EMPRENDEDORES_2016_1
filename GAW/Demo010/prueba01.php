<?php

$cn = mysql_connect("localhost", "eureka", "admin");

if( $cn ){
  echo "Conexión ok.";
} else {
  echo "Error";
}

$db = mysql_select_db("eurekabank", $cn);

if( $db ){
  echo "<br/>BD ok.";
} else {
  echo "<br/>BD no existe.";
}

$sql = "select chr_cliecodigo, vch_cliepaterno, 
  vch_cliematerno, vch_clienombre from cliente";
$rs = mysql_query($sql, $cn);
$filas = mysql_num_rows($rs);

?>
<table border="1">
  <tr>
    <th>CODIGO</th>
    <th>PATERNO</th>
    <th>MATERNO</th>
    <th>NOMBRE</th>
  </tr>
  
  <?php for( $i = 0; $i < $filas; $i++ ){ ?>
  <tr>
    <td><?php echo mysql_result($rs, $i, 0) ?></td>
    <td><?php echo mysql_result($rs, $i, 1) ?></td>
    <td><?php echo mysql_result($rs, $i, 2) ?></td>
    <td><?php echo mysql_result($rs, $i, 3) ?></td>
  </tr>
  <?php } ?>
  
</table>
