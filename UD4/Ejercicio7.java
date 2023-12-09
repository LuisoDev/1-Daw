package UD4;
import java.util.Scanner;
/*Escriu un programa que llija un valor corresponent a una distància en milles marines i escriga la
distància en metres. Sabent que una milla marina equival a 1.852 metres */
public class Ejercicio7 {
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
final int refmetros = 1852;
    System.out.println("Introduzca una distancia en millas para convertirla a metros");
        float millas = entrada.nextFloat();
float metros = millas * refmetros;

    System.out.println("La distancia equivalente a " + millas + " serían " + metros + " metros");
    entrada.close();
    


    }
}
