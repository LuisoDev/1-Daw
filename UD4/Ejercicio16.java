package UD4;
import java.util.Scanner;
/*16. Escriu un programa que llija una qualificació numèrica entre 0 i 10 i la transforma en
qualificació alfabètica, escrivint el resultat.
● de 0 a <3 Molt Deficient.
● de 3 a <5 Insuficient.
● de 5 a <6 Bé.
● de 6 a <9 Notable
● de 9 a 10 Excel·lent */

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
         System.out.println("Introduce la cualificación numerica");
         numero = entrada.nextInt();
             if (numero < 3) {
            System.out.println("Molt Deficient");
             }
             
            else if (numero < 5) {
            System.out.println("Insuficient");
             }
            else if (numero < 6) {
            System.out.println("Bé");
             }
             else if (numero < 9) {
                 System.out.println("Notable"); 
                 }
                else if (numero <= 10) {
                System.out.println("Excel·lent");
             } else {
                 System.out.println("La nota es incorrecta");
             }
            
  
            entrada.close();
        }
    }
    
