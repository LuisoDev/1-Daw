package UD4;
import java.util.Scanner;

 /*    21. Implementa el joc pedra, paper y tisora. Primer, l’usuari 1 introdueix la seua jugada y després
l’usuari 2.
Exemple 1:
Torn del jugador 1 (introdueix pedra, paper o tisora): paper
Torn del jugador 2 (introdueix pedra, paper o tisora): paper
Empat
Exemple 2:
Torn del jugador 1 (introdueix pedra, paper o tisora): paper
Torn del jugador 2 (introdueix pedra, paper o tisora): tisora
Guanya el jugador 2
Exemple 3:
Torn del jugador 1 (introdueix pedra, paper o tisora): pedra
Torn del jugador 2 (introdueix pedra, paper o tisora): tisora
Guanya el jugador 1
} */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String jugador1, jugador2, respuesta1, respuesta2;
        int i, numeroderondas,victorias1, victorias2;
        System.out.println("Vamos a jugar a piedra papel o tijera!");
        System.out.println("Las reglas son sencillas: Piedra gana a tijera, tijera gana a papel y papel gana a piedra");
        System.out.println("Se necesitan 2 jugadores, vamos a introducir sus nombres!");
        System.out.println("Introduce el nombre del primer jugador!");
        jugador1 = entrada.next();
        System.out.println("Introduce el nombre del segundo jugador!");
        jugador2 = entrada.next();
         System.out.println("Introduce el numero de rondas que desea jugar!");
        numeroderondas = entrada.nextInt();
        victorias1=0;
        victorias2=0;
        for (i=1; i<=numeroderondas; i++){
        System.out.println("Comienza el juego! Turno de " + jugador1);
        do { 
            System.out.println(" Introduzca por teclado el movimiento: Piedra, Papel o Tijera");
            respuesta1 = entrada.next();
            if (!respuesta1.toLowerCase().equals("piedra") && !respuesta1.toLowerCase().equals("papel") && !respuesta1.toLowerCase().equals("tijera")){
            System.out.println(" Ha habido un error en la entrada de datos");}
    
            } while (!respuesta1.toLowerCase().equals("piedra") && !respuesta1.toLowerCase().equals("papel") && !respuesta1.toLowerCase().equals("tijera")); 
            
             System.out.println("Turno de " + jugador2);
        do { 
            System.out.println(" Introduzca por teclado el movimiento: Piedra, Papel o Tijera");
            respuesta2 = entrada.next();
            if (!respuesta2.toLowerCase().equals("piedra") && !respuesta2.toLowerCase().equals("papel") && !respuesta2.toLowerCase().equals("tijera")){
            System.out.println(" Ha habido un error en la entrada de datos");}
    
            } while (!respuesta2.toLowerCase().equals("piedra") && !respuesta2.toLowerCase().equals("papel") && !respuesta2.toLowerCase().equals("tijera")); 
            entrada.close();
            if (respuesta1.toLowerCase().equals("piedra") && respuesta2.toLowerCase().equals("tijera")){ 
                 System.out.println(" Victoria de " + jugador1);
                 victorias1++; }
            if (respuesta1.toLowerCase().equals("tijera") && respuesta2.toLowerCase().equals("papel")){ 
                 System.out.println(" Victoria de " + jugador1);
                 victorias1++; }
            if (respuesta1.toLowerCase().equals("papel") && respuesta2.toLowerCase().equals("piedra")){ 
                 System.out.println(" Victoria de " + jugador1);
                 victorias1++; }
            if (respuesta2.toLowerCase().equals("piedra") && respuesta1.toLowerCase().equals("tijera")){ 
                 System.out.println(" Victoria de " + jugador2);
                 victorias2++; }
            if (respuesta2.toLowerCase().equals("tijera") && respuesta1.toLowerCase().equals("papel")){ 
                 System.out.println(" Victoria de " + jugador2);
                 victorias2++; }
            if (respuesta2.toLowerCase().equals("papel") && respuesta1.toLowerCase().equals("piedra")){ 
                 System.out.println(" Victoria de " + jugador2);
                 victorias2++; }
                 if (respuesta2.toLowerCase().equals("piedra") && respuesta1.toLowerCase().equals("piedra")){ 
                 System.out.println(" EMPATE! ");}
                 if (respuesta2.toLowerCase().equals("papel") && respuesta1.toLowerCase().equals("papel")){ 
                 System.out.println(" EMPATE! ");}
                 if (respuesta2.toLowerCase().equals("tijera") && respuesta1.toLowerCase().equals("tijera")){ 
                  System.out.println(" EMPATE! ");} 
                }
                
                if (victorias1 > victorias2){
                  System.out.println(jugador1 + "Has ganado!");
                } if (victorias1 == victorias2) {
                    System.out.println("Habeis empatado! Volved a jugar para desempatar!");
                } else {
                    System.out.println(jugador2 + " Has ganado!");
                } 
                
                }
    }


