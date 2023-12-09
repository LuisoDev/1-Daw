package UD5;
import java.util.Scanner;
/* 4. Realitza un programa que mostre els números des de l'1 fins a un número N que s'introduirà
per teclat */
public class Ejercicio4 {
    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero hasta el que desea contar");
        int numero = entrada.nextInt();
        entrada.close();
        for (i=1;i<=numero;i++){
        System.out.print(i + ", ");
        }
      
     }

} 
    
