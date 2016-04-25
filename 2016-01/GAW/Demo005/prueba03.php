<?php

$cat["Refrigeradora"] = 2850.00;
$cat["Televisor"] = 5870.00;
$cat["Lavadora"] = 1790.00;
$cat["Cama 4 Plazas"] = 4870.00;
$cat["Bar Ingles"] = 2750.00;

?>

<table border="1">
  <tr>
    <th>ARTICULO</th>
    <th>PRECIO</th>
  </tr>
  
  <?php foreach ($cat as $key => $value) {?>
  <tr>
    <td><?php echo $key; ?></td>
    <td><?php echo $value; ?></td>
  </tr>
  <?php } ?>
</table>