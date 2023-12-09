package UD4;

import java.util.Scanner;

/*15. Escriu un programa que llija tres números diferents i ens diga quin és el major. */
public class Ejercicio15 {

        public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

System.out.println("Introduce tres números para comprobar cual es el mayor de estos");
System.out.println("Introduce el primer número");
float numero1 = entrada.nextFloat();
System.out.println("Introduce el segundo número");
float numero2 = entrada.nextFloat();
System.out.println("Introduce el tercer número");
float numero3 = entrada.nextFloat();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1 +" es el número más grande");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2 +" es el número más grande");  
        } else{
              System.out.println(numero3 + " es el más grande");  
        }
        entrada.close();
        }

    }

