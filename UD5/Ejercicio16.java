package UD5;
import java.util.Scanner;
/*16. Realitza un programa en java que demane un nombre primer (en castellà “número primo”)
positiu i ens diga si és primer o no. */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,i;
        boolean primo;
        primo = true;
        System.out.println("Seleccione un número averiguar si es un número primo");
        numero = entrada.nextInt();
        entrada.close();
        for (i=3;i<=numero;i++){
            if (numero % (i-1) == 0){ 
                primo = false;
            } 
                }    
        if (primo == false) {
             System.out.println("No es un número primo");
        }if (primo == true) {
         System.out.println("Es un número primo");
        }    
    
    }
}