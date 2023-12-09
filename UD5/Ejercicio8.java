package UD5;
/*8. Realitza un programa que llija una seqüència de números no nuls fins que s'introduïsca un 0, i
després mostre si ha llegit algun número negatiu, quants positius i quants negatius. */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero,negativos,positivos;
    negativos = 0;
    positivos = 0;
    System.out.println("Introduce números para comprobar cuantos son positivos y negativos, para finalizar la ejecución pulse 0");
        do {
             numero = entrada.nextInt();
            if (numero<0){
                negativos++;
            }
            else {
            positivos++;
            }  if (numero!=0){
            System.out.println("Pulse 0 para acabar la ejecución si lo desea o introduzca otro número");}   
        } while (numero !=0); 
        entrada.close();
        System.out.println("Has introducido " + positivos + " numeros positivos y " + negativos + " numeros negativos");
        }
    }

