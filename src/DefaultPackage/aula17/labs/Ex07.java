package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numeros = 5;
        int num;
        int maior = 0;

        for (int i = 1; i <= numeros ; i++) {
            System.out.printf("Insira o número %d: ", i);
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }

        }

        System.out.printf("O maior número é: %d", maior);

        scan.close();
    }
}