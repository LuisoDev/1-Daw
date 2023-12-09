package UD5;
import java.util.Scanner;
/*10. Realitza un programa que llija una seqüència de notes (amb valors que van de 0 a 10) que
acaba amb el valor -1 i ens diu si va haver-hi o no alguna nota amb valor 10. */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean diez = false;
    System.out.println("Introduce números entre el 0 y el 10");
         numero = entrada.nextInt();
       while (numero !=-1){
        if (numero==10){
            diez =true;}
            if (numero<= -2 || numero >= 11){
                System.out.println("Teclee números del 0 al 10");
            }
             numero = entrada.nextInt();
        }  
        entrada.close(); 
    if (diez==true){
        System.out.println("Se ha detectado un número 10");
    }
    else {
        System.out.println("No se ha detectado ningún número 10");
    }
        
    }
}
