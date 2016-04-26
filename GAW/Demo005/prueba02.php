<?php

$lista[] = "Chiclayo";
$lista[] = "Arequipa";
$lista[] = "Cuzco";
$lista[] = "Huancayo";

echo "<p>Tamaño del arreglo: " . count($lista) . "</p>";
foreach ($lista as $value) {
  echo "<p>$value</p>";
}

for ($i = 0; $i < count($lista); $i++) {
  echo "<p>" . $lista[$i] . "</p>";
}
?>

