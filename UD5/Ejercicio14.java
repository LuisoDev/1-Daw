package UD5;
import java.util.Scanner;
/*14. Realitza un programa que donada una quantitat d'euros que l'usuari introdueix per teclat
(múltiple de 5 €) mostrarà els bitllets de cada tipus que seran necessaris per a aconseguir
aquesta quantitat (utilitzant bitllets de 500, 200, 100, 50, 20, 10 i 5). Cal indicar el mínim de
bitllets possible. Per exemple, si l'usuari introdueix 145 el programa indicarà que serà necessari
1 bitllet de 100 €, 2 bitllets de 20 € i 1 bitllet de 5 € (no serà vàlid per exemple 29 bitllets de 5,
que encara que sume 145 € no és el mínim nombre de bitllets possible). */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int billete500, billete200, billete100, billete50, billete20,  billete10, billete5,retirada,i;
        billete500 = 0; 
        billete200  = 0;
        billete100 = 0; 
        billete50 = 0;
        billete20  = 0; 
        billete10  = 0;
        billete5  = 0; 
        
        System.out.println("Indique la cantidad a retirar en el cajero, en multiplos de 5");
        do {
            retirada = entrada.nextInt();
            if (retirada % 5 != 0){
                System.out.println("Tiene que indicar una cantidad en multiplos de 5");
            }
        } while (retirada % 5 != 0);
        
            for (i=500;i <=retirada; i++) {
                billete500++;
                retirada =  retirada - 500;
            }
            for (i=200;i <= retirada; i++) {
                billete200++;
                retirada =  retirada - 200;
    }       for (i=100;i <= retirada; i++) {
                billete100++;
                retirada =  retirada - 100;
            }
            for (i=50;i <= retirada; i++) {
                billete50++;
                retirada =  retirada - 50;
    }       for (i=20;i <= retirada; i++) {
                billete20++;
                retirada =  retirada - 20;
            }
            for (i=10;i <= retirada; i++) {
                billete10++;
                retirada =  retirada - 10;
    }       for (i=5;i <= retirada; i++) {
                billete10++;
                retirada =  retirada - 5;
    }
            System.out.print(" Usted va a recibir:");
                if (billete500>=1) {
                    System.out.print(billete500 + " Billetes de 500,");
                    }
                     if (billete200>=1) {
                    System.out.print(billete200 + " Billetes de 200,");
                    }
                     if (billete100>=1) {
                    System.out.print(billete100 + " Billetes de 100,");
                    }
                    if (billete50>=1) {
                    System.out.print(billete50 + " Billetes de 50,");
                    }
                     if (billete20>=1) {
                    System.out.print(billete20 + " Billetes de 20,");
                    }
                     if (billete10>=1) {
                    System.out.print(billete10 + " Billetes de 10,");
                    }
                    if (billete5>=1) {
                    System.out.print(billete5 + " Billetes de 5.");
                    }
                    entrada.close();
}
}
