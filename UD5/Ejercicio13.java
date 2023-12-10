package UD5;
import java.util.Scanner;
/*13. Realitza un programa on l'usuari "pensa" un número de l'1 al 100 i l'ordinador intenta
endevinar-lo. És a dir, l'ordinador anirà proposant números una vegada i una altra fins a
endevinar-lo (l'usuari haurà d'indicar-li a l'ordinador si és major, menor o igual al número que
ha pensat). */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intento;
        double minimo, maximo;
        boolean acierto;
        String respuesta;
        acierto = false;
        minimo = 1;
        maximo = 100;
        System.out.println("Piensa un número del 1 al 100! Voy a intentar adivinarlo!");
        
        while (acierto==false) {
            intento = (int) (minimo + (maximo - minimo) * Math.random());
            System.out.println("Es el número: "+ intento + "?.");
          do {   
                System.out.println("Introduce si o no! (s/n)");
                respuesta = entrada.next();
                if (!respuesta.toLowerCase().equals("s") && !respuesta.toLowerCase().equals("n") ){
                System.out.println(" Ha habido un error en la entrada de datos");}
            } while (!respuesta.toLowerCase().equals("s") && !respuesta.toLowerCase().equals("n"));
            if (respuesta.toLowerCase().equals("s"))
             { System.out.println(" Bieeen! Gracias por jugar conmigo!");
             acierto = true; }
             else {
                do {   
                System.out.println("Es más alto? (s/n)");
                respuesta = entrada.next();
                if (!respuesta.toLowerCase().equals("s") && !respuesta.toLowerCase().equals("n") ){
                System.out.println(" Ha habido un error en la entrada de datos");}
            } while (!respuesta.toLowerCase().equals("s") && !respuesta.toLowerCase().equals("n"));
                if (respuesta.toLowerCase().equals("s")) {
                    minimo = intento;}
                    else { 
                        maximo = intento;
                    }
                }
             }
             entrada.close();
        }
        
    }

