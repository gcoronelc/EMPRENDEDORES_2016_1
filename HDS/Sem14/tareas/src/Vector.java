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
public class Vector {
public static void main(String args[])
{
Scanner e = new Scanner(System.in);
System.out.print("Intoduce el tamano del arreglo...??? ");
int tam = e.nextInt();
int array[] = new int[tam];
int i = 0;
do{
System.out.println("Intro un elemento...");
int dato = e.nextInt();
array[i] = dato;
i++;
}while( i < array.length);

int pos=0; int neg=0; int nulos=0;
for( int j = 0; j < array.length; j++ )
{
if( array[j] < 0)
{
neg++;
}
else if( array[j] > 0)
{
pos++;
}
else{
nulos++;
}
}
System.out.println("Postivos:"+pos);
System.out.println("Negativos"+neg);
System.out.println("Nulos:"+nulos);
}
}
