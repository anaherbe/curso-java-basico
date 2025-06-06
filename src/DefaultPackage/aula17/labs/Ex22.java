package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número inteiro: ");
        int num = scan.nextInt();

        for ( int i = 2; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
                
            }

            if (primo && num == i) {
                System.out.printf("O número %d é um número primo", num);
            } else if (!primo && num == i) {
                System.out.printf("O número %d não é um número primo.\n pode ser dividido por: ", num, num);
                for (int t = 1; t <= num; t++) {
                    if (num % t == 0) {
                        if (t < num) {
                            System.out.printf("%d, ", t);
                        } else {
                            System.out.printf("%d.", t);
                        }
                    }
                }
            }

        }

        scan.close();
    }
}