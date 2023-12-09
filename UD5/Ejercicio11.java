package UD5;
/*11. Realitza un programa que sume independentment els parells i els imparells dels números
compresos entre 100 i 200, i després mostre per pantalla totes dues sumes. */
public class Ejercicio11 {
    public static void main(String[] args) {
        int i,pares,impares;
        pares = 0;
        impares = 0;
        for (i=100; i<=200;i++){
            if (i % 2==0){
                pares = i + pares; 
            }
            else {
                impares = i + impares;
            }

        }
        System.out.println("El resultado de la suma de los numeros pares entre 100 y 200 es: "+ pares);
        System.out.println("El resultado de la suma de los numeros impares entre 100 y 200 es: "+ impares);
    }
}
