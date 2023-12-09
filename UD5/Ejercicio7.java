package UD5;
/*7. Realitza un programa que llija 10 números no nuls i després mostre un missatge indicant
quants són positius i quants negatius. */
import java.util.Scanner;   
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, i, positivos, negativos;
        positivos=0;
        negativos=0;
        
    System.out.println("Introduce números para comprobar cuantos son positivos y negativos");
 
    for (i=1; i <= 10; i++) {
        do {
             numero = entrada.nextInt();
             if (numero==0){
                System.out.println("No se permiten numeros nulos");
             }    
        } while (numero==0);
        
        if (numero >= 0) {
            positivos++;
        }
        else {
            negativos++;
        }
    }
entrada.close();

     System.out.println("Has introducido " + positivos + " numeros positivos y " + negativos + " numeros negativos");     
 } 
  
}