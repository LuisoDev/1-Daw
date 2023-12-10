package UD5;
/*Realitza un programa que demane un número i construïsca per pantalla la seua piràmide.
Exemple: */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i,numero,j,k;
        System.out.println("Escribe un numero para obtener su su piramide de asteriscos");

        numero = entrada.nextInt();
        entrada.close();
        if (numero < 0){
            System.out.println("*");
        }
        for (i=1;   i<=numero;   i++)  
          {
            for (k = (numero-i); k>=1; k--)  {
                System.out.print(" ");
              }
            for (j=1; j<=(i*2-1); j++)
            { 
                System.out.print("*");    } 
                System.out.println("");
            }  
        }    
    }

