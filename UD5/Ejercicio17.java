package UD5;
/*PROGRAMACIÓ UD05. BUCLES EN JAVA
17. Realitza un programa que llija i accepte únicament aquells números que siguen majors
que l'últim donat, es a dir, l'anterior introudït. La introducció de números finalitza amb la
introducció d'un 0. Al final es mostrarà:
El total de números introduïts, exclòs el 0.
El total de números fallats. */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer digio que sirva como referencia, deberás introducir numeros mayores para no fallar, pulsa 0 para finalizar");
        int numero, referencia, contador, contadorfallo;
        contador = 0;
        contadorfallo = 0;
        referencia = 0;
        do {
            System.out.println("Dime un número: ");
            numero = entrada.nextInt();    
            if (numero <= referencia){
             System.out.println("Fallo! El número debe ser mayor!");   
                contadorfallo++; }
            referencia = numero;
            contador++;  
        } while (numero!=0);
        entrada.close();
        System.out.println("Total de numeros introducidos: " + contador);
        System.out.println("Numero de fallos: " + contadorfallo);

    }
}
