package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número inteiro: ");
        int num = scan.nextInt();

        for ( int i = 2; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
                
            }

            if (primo && num == i) {
                System.out.printf("O número %d é um número primo", num);
            } else if (!primo && num == i) {
                System.out.printf("O número %d não é um número primo", num);
            }

        }

        scan.close();
    }
}