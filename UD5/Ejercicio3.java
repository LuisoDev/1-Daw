package UD5;
/* 3. Realitza un programa que mostre els nombres parells compresos entre l'1 i el 200. Aquesta
vegada utilitza un comptador sumant d'1 en 1. */
public class Ejercicio3 {
    public static void main(String[] args) {
        int i;
    for (i=1; i <= 200; i++){
        if (i % 2 == 0){
        System.out.print(i + ", ");
         i = i + 1;
    }
} 
}
}
