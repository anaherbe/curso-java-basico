package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numeros = 5;
        int num;
        int media = 0;
        int soma = 0;

        for (int i = 1; i <= numeros ; i++) {
            System.out.printf("Insira o número %d: ", i);
            num = scan.nextInt();

            soma += num;

        }

        media = soma / numeros;

        System.out.printf("\nA soma dos números é: %d ", soma);

        System.out.printf("\nA média dos números é: %d ", media);

        scan.close();
    }
}