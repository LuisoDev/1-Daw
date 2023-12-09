package UD4;
import java.util.Scanner;
/* 20. Una pastisseria ens ha demanat fer un programa que faça pressupostos de pastissos. El
programa preguntarà primer de quin sabor vol l'usuari el pastís: poma, maduixa o xocolata. El
pastís de poma val 18 euros i el de maduixa 16. En cas de seleccionar el pastís de xocolata, el
programa ha de preguntar a més si la xocolata és negra o blanca; la primera opció val 14 euros
i la segona 15. Finalment, es pregunta si s'hi afegeix nata i si es personalitza amb un nom; la
nata suma 2,50 i l'escriptura del nom 2,75.
Exemple: Trieu un sabor (poma, maduixa o xocolata): xocolata
Quin tipus de xocolata voleu? (negre o blanc): negre
Vol nata? (si o no): si
Voleu posar-hi un nom? (si o no): no
Pastís de xocolata negra: 14,00 €
Amb nata: 2,50 €
Total: 16,50 € */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int manz = 18;
        final int fres = 16;
        final int chocon = 14;
        final int chocob = 15;
        float carrito = 0f;
        final float suplementonata = 2.50f;
        final float suplementonombre = 2.75f;
        String respuesta;
        do { 
        System.out.println(" Introduzca por teclado el sabor que desee: Manzana, Fresa o Chocolate");
        respuesta = entrada.next();
        if (!respuesta.toLowerCase().equals("manzana") && !respuesta.toLowerCase().equals("fresa") && !respuesta.toLowerCase().equals("chocolate")){
        System.out.println(" Ha habido un error en la entrada de datos");}

        } while (!respuesta.toLowerCase().equals("manzana") && !respuesta.toLowerCase().equals("fresa") && !respuesta.toLowerCase().equals("chocolate")); 
        if (respuesta.toLowerCase().equals("manzana")) {
            carrito = carrito + manz;
             System.out.println(" Pastel de manzana:" + manz + " euros.");
        }
        if (respuesta.toLowerCase().equals("fresa")) {
            carrito = carrito + fres;
            System.out.println(" Pastel de fresa:" + fres + " euros.");
        }
        if (respuesta.toLowerCase().equals("chocolate")) {
            do { 

        System.out.println(" Escriba el tipo de chocolate quiere? (blanco o negro):");
        respuesta = entrada.next();
         if (!respuesta.toLowerCase().equals("blanco") &&  !respuesta.toLowerCase().equals("negro")) {
        System.out.println(" Ha habido un error en la entrada de datos");}

        } while (!respuesta.toLowerCase().equals("blanco") &&  !respuesta.toLowerCase().equals("negro")); 

        if (respuesta.toLowerCase().equals("blanco")) {
            carrito = carrito + chocob;
             System.out.println(" Pastel de chocolate blanco:" + chocob + " euros.");

        }
        if (respuesta.toLowerCase().equals("negro")) {
            carrito = carrito + chocon;
            System.out.println(" Pastel de chocolate negro:" + chocon + " euros.");
        }
     } 
         do { 

        System.out.println(" Quiere añadirle nata? (s/n): ");
        respuesta = entrada.next();
        if (!respuesta.toLowerCase().equals("s") &&  !respuesta.toLowerCase().equals("n")) {
        System.out.println(" Ha habido un error en la entrada de datos");}

        } while (!respuesta.toLowerCase().equals("s") &&  !respuesta.toLowerCase().equals("n")); 

        if (respuesta.toLowerCase().equals("s")) {
        carrito = carrito + suplementonata;
        System.out.println(" Suplemento nata:" + suplementonata + " euros.");
        }
         else {
            System.out.println(" Sin suplemento de nata: 0 euros.");

        } do { 
         System.out.println(" Quiere que le escribamos su nombre? (s/n): ");
        respuesta = entrada.next();
         if (!respuesta.toLowerCase().equals("s") &&  !respuesta.toLowerCase().equals("n")) {
        System.out.println(" Ha habido un error en la entrada de datos");}

        } while (!respuesta.toLowerCase().equals("s") &&  !respuesta.toLowerCase().equals("n")); 

        if (respuesta.toLowerCase().equals("s")){
        carrito = suplementonombre + carrito;
        System.out.println(" Suplemento de nombre: " + suplementonombre + " euros.");
        }
        else {
    System.out.println("Sin suplemento de nombre:  0 euros.");
        }
        System.out.println("Total: " + carrito + " euros.");
        entrada.close();
    }

    }
    

