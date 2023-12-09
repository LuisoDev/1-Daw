package UD4;
import java.util.Scanner;
/* Escriu un programa que demana l'edat per teclat i ens mostra el missatge de “Eres major
d'edat” sol si ho som. */
public class Ejercicio8 {

    public static void main(String [] args){
Scanner entrada = new Scanner(System.in);

System.out.println("Intrduzca su edad para comprobar si es mayor de edad");

int edad = entrada.nextInt();

if (edad >= 18){
    System.out.println("Es usted mayor de edad");
} else {
    System.out.println("Aun no eres mayor de edad chico!");
}
entrada.close();
    }
    
}
