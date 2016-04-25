<!DOCTYPE html>
<?php require 'lib/lib_mate.php';
if(isset($_REQUEST["btnProcesar"])){
	//datos
	$producto=$_REQUEST["producto"];
	$precio=$_REQUEST["precio"];  
	$cant = $_REQUEST["cant"];  
	//proceso
	$total = total($precio, $cant);
	$importe = importedeventa($precio, $cant);
}

?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <h1> VENTA DE UN PRODUCTO </h1>
 
        <form method="post" action="index.php">
            <p> 
                Nombre del producto:<input type="text" name="producto"/>
            </p>
            <p> 
                precio de venta:<input type="text" name="precio"/>
            </p>       
            <p> 
             cantidad vendido  :<input type="text" name="cant"/>
            </p>
			<p><input type="submit" name="btnProcesar" value="Procesar"/></p>
        </form>
		
		
        <?php if(isset($_REQUEST["btnProcesar"])) { ?>
        <h2> RESPUESTA</h2>
               
         <p>nombre del producto:<?php echo $producto; ?> </p>
          <p>precio de venta:<?php echo $precio; ?> </p>
           <p>cantidad vendido:<?php echo $cant; ?> </p>
        <p>importe de la venta:<?php echo $importe ;?> </p>
        <p>impuesto:<?php echo $impuesto ;?> </p>
         <p>total:<?php echo $total ;?> </p>
        <?php } ?>
    </body>
</html>
