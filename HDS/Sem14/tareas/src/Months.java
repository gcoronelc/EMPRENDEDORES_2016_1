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
public class Months {
public static void main(String[]args){
String[] meses = {"ENERO", "FEBRERO", "MARZO","ABRIL","MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE","NOVIEMBRE", "DICIEMBRE"};
Scanner scanner = new Scanner(System.in);
System.out.println("ingrese un numero");
int numero = scanner.nextInt();
if(numero < 1 || numero > 12){
System.out.println("Este mes no existe!!...");
}
for (int i = 1; i <=12; i++) {
if(i == numero){
System.out.println(meses[i-1]);
}
}
}
}



