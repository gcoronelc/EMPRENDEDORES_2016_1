<?php

$lista[0] = "Chiclayo";
$lista[1] = "Arequipa";
$lista[10] = "Cuzco";
$lista[50] = "Huancayo";

echo "<p>Tamaño del arreglo: " . count($lista) . "</p>";
foreach ($lista as $value) {
  echo "<p>$value</p>";
}

for ($i = 0; $i < count($lista); $i++) {
  echo "<p>" . $lista[$i] . "</p>";
}
?>

