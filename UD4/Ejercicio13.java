package UD4;
import java.util.Scanner;
/*13. Escriu un programa que llig dos números i els visualitza en ordre ascendent. */
public class Ejercicio13 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduzca dos números para visualizarlos en orden ascendente.");
    System.out.println("Introduzca el primer número.");
    int num1 = entrada.nextInt();
    System.out.println("Introduzca el segundo número.");
    int num2 = entrada.nextInt();

    if (num1 < num2){
        System.out.println(num1 +", " + num2);
    }else {
         System.out.println(num2 +", " + num1);

    }
    entrada.close();

    }    
}
