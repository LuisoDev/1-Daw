package UD4;
import java.util.Scanner;
/*18. Escriu un programa que calcula el salari net setmanal d'un treballador en funció del nombre
d'hores treballades i la taxa d'impostos d'acord amb les següents hipòtesis:
● Les primeres 35 hores es paguen a tarifa normal.
● Les hores que passen de 35 es paguen a 1,5 vegades la tarifa normal.
● Les taxes d'impostos són:
○ Els primers 500 euros són lliures d'impostos.
○ Els següents 400 tenen un 25% d'impostos.
○ Els restants un 45% d'impostos.
Escriure nom, salari brut, taxes i salari net. */
public class Ejercicio18 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String nombre = entrada.nextLine();
          System.out.println("Introduzca horas trabajadas");
            int horastrabajadas = entrada.nextInt();
               System.out.println("Introduzca salario por hora trabajada");
                  
                 float salariobruto, salarioimpuestos, impuestos, preciohora, preciohoraextra;

                  preciohora = entrada.nextFloat();
                    impuestos = 0;
                    salarioimpuestos = 0;
               int horasextra = horastrabajadas - 35;
                if (horasextra <0) {
                    horasextra = 0;
                }
                 preciohoraextra = preciohora * 1.5f;
                  salariobruto = (horastrabajadas * preciohora) + (horasextra * preciohoraextra);

              if (salariobruto <= 500){

                  salarioimpuestos = salariobruto;
                 
              }
              if (salariobruto > 500 && salariobruto <=900){

                impuestos = (salariobruto - 500) / 100 * 25;

                salarioimpuestos = salariobruto - impuestos;
                }
                if (salariobruto > 900) {
                     impuestos = ((salariobruto - 900)  / 100 * 45) + 100;
               
                 salarioimpuestos = salariobruto - impuestos;
                }
            
                System.out.println("El salario de bruto de " + nombre + " son: " + salariobruto + " de los cuales hay que descontar " + impuestos + " en concepto de tasas");
                System.out.println("El salario de neto total es de " + salarioimpuestos + " euros.");

                entrada.close();
                }
                
              }


        





    

