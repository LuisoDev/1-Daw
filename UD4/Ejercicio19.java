package UD4;
import java.util.Scanner;
/*PROGRAMACIÓ UF3. ESTRUCTURES REPETITIVES
2
EXERCICIS AMPLIACIÓ
19. Una botiga ven banderes personalitzades de la màxima qualitat i ens ha demanat fer un
configurador que calcule el preu segons alt i ample. El preu base d‟una bandera és d’un
cèntim d’euro el centímetre quadrat. Si la volem amb un escut brodat, el preu s'incrementa
en 2,50 € independentment de l'escut. Les despeses d'enviament són 3,25€. L'IVA ja està
inclòs a totes les tarifes.
Exemple: Introduïu l'alçada de la bandera en cm: 20
Ara introduïu l'amplada: 35
Vol escut brodat? (s/n): n
Gràcies. Aquí teniu el desglossament de la vostra compra.
Bandera de 700 cm2: 7,00 €
Sense escut: 0,00 €
Despeses d'enviament: 3,25 €
Total: 10,25 € */
public class Ejercicio19 {

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println(" Introduce la altura de tu bandera");
    float alturabandera = entrada.nextFloat();
       System.out.println(" Introduce el ancho de tu bandera");
          float anchobandera = entrada.nextFloat();
          float areabandera = alturabandera * anchobandera;
            final float envio = 3.25f;
            float precioescudo = 0;
            String escudo;
            do {
                System.out.println("¿Quieres un escudo bordado en tu bandera? (s/n)");
                escudo = entrada.next();
                System.out.println("Introduce un valor valido (s o n)");
            } while (!escudo.toLowerCase().equals("s") && !escudo.toLowerCase().equals("n"));         
        if (escudo.toLowerCase().equals("s")) { 
         precioescudo = 2.50f;
         System.out.println("Con escudo: 2,50 euros");
        } else {
            precioescudo = 0f;
            System.out.println("Sin escudo: 0,00 euros");
        }     
           System.out.println(" Gastos de envío: 3,25 euros");
        float preciototal = (areabandera * 0.01f) + precioescudo + envio;
         System.out.println("Total: " + preciototal + " euros.");
entrada.close();   
}   
}
