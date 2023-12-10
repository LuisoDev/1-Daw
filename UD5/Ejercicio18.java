package UD5;
/*18. Realitza un programa per a calcular la suma dels quadrats dels 5 primers nombres naturals. */
public class Ejercicio18 {
    public static void main(String[] args) {
        int i, resultado;
        resultado = 0;
        for (i=1;   i<=5;   i++)    {
            resultado = resultado + (i*i);
        }
        System.out.println("El resultado de la suma de los cuadrados de los primeros 5 números naturales es: " + resultado);
    }
}
