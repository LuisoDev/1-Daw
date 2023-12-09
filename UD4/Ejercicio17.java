package UD4;
import java.util.Scanner;
/*17. Escriu un programa que rep com a dades d'entrada una hora expressada en hores, minuts i
segons que ens calcula i escriu l'hora, minuts i segons que seran, transcorregut un segon. */
public class Ejercicio17 {
    
    public static void main(String[] args) {
        System.out.println("Intruduce una hora con sus minutos y segundos");
Scanner entrada = new Scanner(System.in);
int hora, minutos, segundos;
             System.out.println("Intruduce la hora");
              hora = entrada.nextInt();
        
              do {
                 System.out.println("Intruduce los minutos");
                 minutos = entrada.nextInt();
                 if (minutos >59) {
                    System.out.println("El valor de minutos es incorrecto");
                     System.out.println("Introduzca un valor entre 0 y 59");
                 }
              } while (minutos > 59);
                do {  
                     System.out.println("Intruduce los segundos");
                 segundos = entrada.nextInt();
                 if (segundos >59) {
                    System.out.println("El valor de segundos es incorrecto");
                     System.out.println("Introduzca un valor entre 0 y 59");
                } 
            } while (segundos >59);

            segundos++;
            if (segundos == 60){
                minutos++;
                segundos = 0;
            }    if (minutos == 60){
                    hora++;
                    minutos = 0;
                }
                System.out.println("La hora resultante tras haber trasncurrido un minuto es igual a:");
                 System.out.println(hora + " horas," + minutos + " minutos," + segundos + " segundos.");
        entrada.close();

    }
}
