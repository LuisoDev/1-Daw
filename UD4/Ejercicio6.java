package UD4;
import java.util.Scanner;

public class Ejercicio6 {
    /*Escriu un programa que donat el preu d'un article i el preu de venda real ens mostre el
percentatge de descompte realitzat. */
    public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
System.out.println("Introduzca el precio del artículo");
int precio = entrada.nextInt();
System.out.println("Introduzca de venta del artículo");
int precioventa = entrada.nextInt();

int porcentaje = (precioventa * 100 / precio) - 100;

if (porcentaje <= 0){
    porcentaje = porcentaje * -1;
    System.out.println("Se ha aplicado un " + porcentaje + "% de descuento sobre el artículo");
}else {
     System.out.println("Se ha aplicado un " + porcentaje + "% de incremento sobre el artículo");
    
}
entrada.close();
    }
}
