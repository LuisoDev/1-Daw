package UD5;
/*20. Realitza un programa que demane un número enter N entre 0 i 20 i després mostre per
pantalla els números des d'1 fins a N, un en cada línia, repetint cada número tantes vegades com
el seu valor. */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i,j,numero;
        System.out.println("Escribe un numero para obtener su numero de asteriscos, los números negativos solo obtendrán 1");
        do {
            numero = entrada.nextInt();
            if (numero <= 0 || numero > 20){
                System.out.println("El valor debe comprender entre el 0 y el 20");
            }
        } while (numero <= 0 || numero > 20);
        entrada.close();
        for (i = 1; i <= numero; i++){

            for (j = 1; j<=i; j++){
            System.out.print(i);
            }
            System.out.println("");

        }
  
    }
}
