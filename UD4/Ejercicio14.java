package UD4;
import java.util.Scanner;
/*
 *11. Escriu un programa que llig 2 números i mostra el major.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

System.out.println("Introduce dos números para comprobar cual es el mayor de estos");
System.out.println("Introduce el primer número");
float numero1 = entrada.nextFloat();
System.out.println("Introduce el segundo número");
float numero2 = entrada.nextFloat();

        if (numero1 < numero2){
            System.out.println(numero2 +" es el número más grande");
        } else if (numero2 < numero1) {
            System.out.println(numero1 +" es el número más grande");  
        } else{
              System.out.println("Los números son iguales");  
        }
        entrada.close();
        }

    }
