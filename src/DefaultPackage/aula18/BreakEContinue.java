package DefaultPackage.aula18;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número: ");
        int num = scan.nextInt();

        System.out.printf("Insira um limite: ");
        int limite = scan.nextInt();

        /* 
        for (int i = num; i <= limite; i++) {
            if (i % 7 == 0) {
                System.out.printf("O valor de i é: %d", i);
                break;
            }
        } */

        for (int i = num; i <= limite; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.printf("O valor de i é: %d\n", i);
        }

        scan.close();
    }
}