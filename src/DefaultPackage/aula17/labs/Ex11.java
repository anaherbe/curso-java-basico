package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o primeiro número inteiro: ");
        int num1 = scan.nextInt();

        System.out.printf("Insira o segundo número inteiro: ");
        int num2 = scan.nextInt();

        int soma = 0;

        for ( ; num1 < num2; num1++) {
            soma += num1;
        }

        for ( ; num2 <= num1; num1--) {
            soma += num1;
        }

        System.out.println("A soma do intervalo entre os números é: " + soma);

        scan.close();
    }
}