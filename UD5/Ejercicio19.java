package UD5;
/*19. Realitza un programa que lija un número i a continuació escriga el caràcter “*” tantes
vegades com el valor numèric llegit. En aquells casos en què el valor llegit no siga positiu s'haurà
d'escriure un únic asterisc */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i,numero;
        System.out.println("Escribe un numero para obtener su numero de asteriscos, los números negativos solo obtendrán 1");
        numero = entrada.nextInt();
        entrada.close();
        if (numero < 0){
            System.out.println("*");
        }
        for (i=1;   i<=numero;   i++)    {
            System.err.print("*");
        }
    
    }
}
