package UD5;
/*24. Escriu un programa que, donat un número enter positiu, ens diga quants són i quant sumen els
dígits parells que conté. Els dígits parells es mostraran ordenadament d’esquerra a dreta. Per
a fer-ho utilitzarem el tipus long en lloc de l’int per poder admetre números grans.
Exemple: Introdueix un número enter positiu: 94026782
Dígits parells: 4 0 2 6 8 2
Suma dels dígits parells és: 22 */

import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.println("Escribe un numero para sumar los numeros pares que lo compreden, tiene que ser mayor que 0");
    int restopositivo,acumuladorrestos;
    long numero, numerovuelta;
    int i; 
    acumuladorrestos = 0;
    numerovuelta =0;
    do {
        numero = entrada.nextInt();
        if (numero <=0) {
            System.out.println("Se ha producido un error en la entrada de datos"); }       
    } while (numero <=0);
    entrada.close();

        while (numero > 0 ) {
            numerovuelta = (numerovuelta*10) + (numero%10);
            numero= numero / 10;
        }
        System.out.print("Los digitos positivos son: ");
        for (i=1;   i<= numerovuelta/i; i= i*=1) {
            restopositivo = (int)numerovuelta % 10;
            numerovuelta = numerovuelta / 10;
            if (restopositivo % 2 == 0) {
                System.out.print(restopositivo + ", ");
                acumuladorrestos = acumuladorrestos + restopositivo; } }
    System.out.println("La suma de los restos positivos es: " + acumuladorrestos);
    }        
}
       

