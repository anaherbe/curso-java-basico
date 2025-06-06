package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numeros = 10;
        int num;
        int impar = 0;
        int par = 0;

        for (int i = 1; i <= numeros; i++) {
            System.out.printf("Insira o número %d: ", i);
            num = scan.nextInt();
            if (num % 2 == 0) {
                par ++;
            } else {
                impar ++;
            }
        }

        System.out.printf("Dos 10 números %d são pares e %d são ímpares.", par, impar);

        scan.close();
    }
}