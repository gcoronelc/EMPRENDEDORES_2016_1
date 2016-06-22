/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Pregunta01 {
public static void main(String[] args){ 
Scanner in = new Scanner(System.in); 
String[] nombres = {"Unidades", "Decenas", "Centenas"}; 
System.out.println("Introduzca un numero"); 
int nEntero = in.nextInt(); 
int cd = contarDigitos(nEntero); 
if(cd<=3)
separar(nEntero,nombres); 
else
System.out.println("Errrrrr.... ");
} 
private static void separar (int nEntero,String[] nombres){ 
System.out.println("El numero esta "+ nEntero +" compuesto por: "); 
int j = 0; 
while( nEntero > 0 ){ 
System.out.println( (nEntero%10) + " " + nombres[j] ); 
nEntero = nEntero/10; 
j++; 
} 
} 
private static int contarDigitos(int nEntero){
if(nEntero<10)
return 1;
else
return 1+contarDigitos(nEntero/10);
}
}
  

