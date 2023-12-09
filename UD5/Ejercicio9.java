package UD5;

/*9. Realitza un programa que calcule i escriga la suma i el producte dels 10 primers nombres
naturals. */
public class Ejercicio9 {
    public static void main(String[] args) {
        int i,suma,producto;
        suma = 0;
        producto = 1;
        for (i=1; i<=10;i++){
            suma = suma + i;
            producto = producto * i;
            
        }
        System.out.println("Este es el resultado de la suma de los 10 primeros numeros naturales: " + suma);
        System.out.println("Este es el resultado de la suma de los 10 primeros numeros naturales: " + producto);
    }
    
}
