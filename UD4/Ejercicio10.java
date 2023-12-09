package UD4;
import java.util.Scanner;
/* 10. Escriu un programa que llig dos números, calcula i mostra el valor de la seua suma, resta,
producte i divisió. (Ten en compte la divisió per zero). */
public class Ejercicio10 {

        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduzca el primer valor numérico");
            float num1 = entrada.nextFloat();
            System.out.println("Introduzca el segundo valor numérico");
            float num2 = entrada.nextFloat();
            float suma, resta, producto, division;
            suma = num1 + num2;
            resta = num1 - num2;
            producto = num1 * num2;
            System.out.println("La suma de los números es: " + suma);
              System.out.println("La resta de los números es: " + resta);
               System.out.println("La multiplicación de los números es: " + producto);
            if (num2 == 0){
                System.out.println("No se puede divir entre 0");
            } else {
                 division = num1 * num2;
                 System.out.println("La division de los números es: " + division);
            }
            entrada.close(); 
        }
}
