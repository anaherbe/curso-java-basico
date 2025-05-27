package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o primeiro número: ");
        double num1 = scan.nextDouble();

        System.out.printf("Insira o segundo número: ");
        double num2 = scan.nextDouble();

        System.out.printf("Insira o terceiro número: ");
        double num3 = scan.nextDouble();

        boolean maior1 = num1 > num2 && num1 > num3;
        boolean maior2 = num2 > num1 && num2 > num3;
        boolean maior3 = num3 > num1 && num3 > num2;
        boolean iguais = num1 == num2 && num2 == num3;

        if (maior1) {
            System.out.printf("%.2f é o maior número.", num1);
        } else if (maior2){
            System.out.printf("%.2f é o maior número.", num2);
        } else if (maior3){
            System.out.printf("%.2f é o maior número.", num3);
        } else if (iguais){
            System.out.printf("O número %.2f foi digitado três vezes", num1);
        }

        scan.close();
    }
}
