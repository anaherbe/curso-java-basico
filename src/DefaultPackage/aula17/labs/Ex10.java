package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o primeiro número inteiro: ");
        int num1 = scan.nextInt();

        System.out.printf("Insira o segundo número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("O intervalo dos números é: ");

        for ( ; num1 < num2; num1++) {
            System.out.println(num1);
        }

        for ( ; num2 <= num1; num1--) {
            System.out.println(num1);
        }

        scan.close();
    }
}