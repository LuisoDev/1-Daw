package UD4;
import java.util.Scanner;
/*12. Escriu un programa que llig un número i em diu si és positiu o negatiu, considerarem el zero
com a positiu. */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número para saber si es negativo o positivo");

        float num = entrada.nextFloat();

        if (num >= 0){
                    System.out.println("Su número es positivo");
        } else {
                     System.out.println("Su número es negativo");
        }
entrada.close();
    }
}
