package UD5;
import java.util.Scanner;
/*6. Realitza un programa que llija 10 números no nuls i després mostre un missatge de si ha llegit
algun número negatiu o no. */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, i;
        boolean positivo = false;
    System.out.println("Introduce números para comprobar si alguno es positivo");
    for (i=1; i <= 10; i++) {
        do {
             numero = entrada.nextInt();
             if (numero==0){
                System.out.println("No se permiten numeros nulos");
             }    
        } while (numero==0);
        
        if (numero >= 0) {
            positivo = true;
        }
        else {
        }
    }
    entrada.close();
    if (positivo==true){
        System.out.println("Se ha detectado un número positivo");
    }
    else {
        System.out.println("No se ha detectado ningún número positivo");
    }
}
 }