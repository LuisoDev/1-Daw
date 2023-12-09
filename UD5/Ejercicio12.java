package UD5;
import java.util.Scanner;
/* 12. Realitza un programa que calcule el valor A elevat a B (A^B) sense fer ús de l'operador de
potència (^), sent A i B valors introduïts per teclat, i després mostre el resultat per pantalla. */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce dos digitos el resultado de la potencia.");
        int base,potencia,i,resultado;
        System.out.println("Introduca el digito que hará de base.");
        base = entrada.nextInt();
        System.out.println("Introduca el digito que hará de potencia.");
        potencia = entrada.nextInt();
        entrada.close();
        resultado = base;
        for (i=1; i<=potencia-1; i++){
            resultado = resultado * base;
        }
        System.out.println("El resultado de la potencia sería " +resultado);

        
    }
    
}
