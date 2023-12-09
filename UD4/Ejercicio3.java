package UD4;
import java.util.Scanner;
public class Ejercicio3 {
    /* Enunciado: Escribe un programa que calcule el area de un cuadrado del que se suministrará la entrada mediante el teclado. */
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe la medida del lado de tu cuadrado en números enteros");
        int lado = entrada.nextInt();
        int area = lado*lado;
        System.out.println("El area de tu cuadrado de lado " +lado +" es de: " +area);
        entrada.close();
    }
}
