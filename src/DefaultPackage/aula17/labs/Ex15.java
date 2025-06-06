package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número: ");
        int numero = scan.nextInt();

        int num;
        int num1 = 0;

        for (int num2 = 1; num2 < numero;) {
            num = num1 + num2;
            num1 = num2;
            num2 = num;

            if (num2 < numero) {
                System.out.print(num2 + " ");
            }
        }

        scan.close();
    }
}