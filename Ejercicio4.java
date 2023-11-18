import java.util.Scanner;
public class Ejercicio4 {
    /* Enunciado: Escribe un programa que lea dos números, calcule y muestre el valor de su suma, resta, multiplicación y su división. */
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el primer número con el que quiera operar");
        int numero1 = entrada.nextInt();
        System.out.println("Escriba el segundo número con el que quiera operar");
        int numero2 = entrada.nextInt();
        int resultadosuma = numero1+numero2;
        int resultadoresta = numero1-numero2;
        int resultadomult = numero1*numero2;
        int resultadodivi = numero1/numero2;
        
        System.out.println("La suma de " +numero1 +" y de " +numero2 + " tiene como resultado: " +resultadosuma);
              System.out.println("La resta de " +numero1 +" y de " +numero2 + " tiene como resultado: " +resultadoresta);
                    System.out.println("La multiplicación de " +numero1 +" por " +numero2 + " tiene como resultado: " +resultadomult);
                          System.out.println("La división de " +numero1 +" entre  " +numero2 + " tiene como resultado: " +resultadodivi);
        
        entrada.close();
    }
}
