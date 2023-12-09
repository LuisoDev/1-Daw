package UD4;
import java.util.Scanner;

public class Ejercicio5 {
    /* Enunciado: Escribe un programa que calcule la longitud, área y volumen de un ciruculo del cual la información del radio que entra por teclado. */
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba la medida del radio de su círculo");
        float radio = entrada.nextInt();
        final double pi = Math.PI;
        double circunfe = 2*pi*radio;
        double area = pi*Math.pow	(radio,2);
        double volumen = 4/3 * pi*Math.pow (radio,3);
        System.out.println("La medida de su circunferencia es de: " +circunfe);
        System.out.println("La medida de area es de: " +area);
        System.out.println("La medida de su volumen es de: " +volumen);
        entrada.close();
    }
}
