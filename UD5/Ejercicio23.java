package UD5;

import java.util.Scanner;

/*23. Escriu un programa que llija un número n d’un digit i imprimisca una piràmide de números
amb n files com la següent */
public class Ejercicio23 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i,numero,j,k,n;
        System.out.println("Escribe un numero para obtener su su piramide de asteriscos");
        numero = entrada.nextInt();
        entrada.close();
        if (numero < 0){
            System.out.println("*"); }
        for (i=1;   i<=numero;   i++) {
            for (k = (numero-i); k>=1; k--) {
                System.out.print(" "); }
            for (j=1; j<=i; j++) {  
                System.out.print(j); } 
                 for (n=i-1; n>=1; n--){    
                System.out.print(n); } 
                System.out.println("");
            }  
        }
}
