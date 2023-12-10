package UD5; 
/*21. Realitza un programa que demane dos números enters A i B, sent B major que A.
Després visualitze els números des d’A fins a B i indique quants d'aquestos són parells */
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int inicio, fin,i,contador;
            contador = 0;
            System.out.println("Introduce dos digitos el primero de ellos menor al segundo");
            inicio = entrada.nextInt();
            do {
                System.out.println("Recuerda el segundo digito tiene que ser mayor");
                fin = entrada.nextInt();
                if (fin < inicio){
                    System.out.println("Error el dato introducido no es correcto");
                }
            } while (fin < inicio);
            entrada.close();
            for (i=inicio;   i<=fin; i++){
                System.out.print(i + ", ");
                if (i % 2 == 0){
                    contador++;
                }
            }
            System.out.println("El total de numeros pares es: " + contador);
    }
    
}
