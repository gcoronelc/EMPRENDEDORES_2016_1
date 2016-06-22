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
public class CMagico {
public static void main(String arg[]){
int[][]m = new int [3][3];
Scanner e = new Scanner(System.in);
int n = 0;
do{
for(int i = 0; i < 3; i++){
for(int j = 0; j < 3; j++){
System.out.println("Enter a element of array");
int d = e.nextInt();
m[i][j] = d;
}
}
n++;
}while(n > 2);
esMagico(m);
}
private static void esMagico(int[][] m) {
int sumaFila = 0; 
int sumaColumna = 0;
int counter =0;
for (int i = 0; i < 3 ; i++){
for (int j = 0; j < 3; j++){
sumaFila += m[i][j];
sumaColumna+=m[j][i];
}
if( isIgual( sumaFila, sumaColumna )){
counter++;
if( counter == 3 ){
System.out.println("Es magico");
mostrar(m);
}else{
sumaFila =0;
sumaColumna = 0;
}
}else{
System.out.println("No es magico!!!");
mostrar(m);
return;
} 
}
}
private static boolean isIgual(int sumaFila, int sumaColumna) {
return sumaFila == sumaColumna;
}
private static void mostrar(int[][] m) {
for(int i = 0; i < 3; i++){
for( int j = 0; j < 3; j++){
System.out.print(m[i][j]); 
}
System.out.println();
}
}
}

