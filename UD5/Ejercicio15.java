package UD5;
/*15. Realitza un programa que compte els múltiples de 3 des del 1 fins a un número que
introduïm per teclat */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,i,contador;
        contador = 0;
        System.out.println("Seleccione un número para hayar los multiplos de 3 que contenga");
        numero = entrada.nextInt();
        for (i=1;i<=numero;i++){
            if (i % 3== 0)
            contador++;
        }
        entrada.close();
        System.out.println("El numero de multiplos es de: " + contador);
        
}    

}
