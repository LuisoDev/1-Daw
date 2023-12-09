package UD5;
import java.util.Scanner;
/*5. Realitza un programa que llija un número positiu N i calcule i visualitze la seua factorial N!
Sent el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2)........* 3*2*1 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,i;
        System.out.println("Introduce un número para que se visualice su factorial");
        do {
            numero = entrada.nextInt();
            if (numero < 0){
                System.out.println("El numero introducido no puede ser negativo");
            }
             entrada.close();
        } while (numero < 0);
        if (numero == 0){
            System.out.println("0! = 1");
        }
        System.out.print(numero + "! = "); 
        for (i=0; i<=numero-1; i++){
            if (i != numero-1 ){
             System.out.print((numero - i) + "*");}
             else {
                 System.out.print("1");
             }

        }
      
        
    }
}
