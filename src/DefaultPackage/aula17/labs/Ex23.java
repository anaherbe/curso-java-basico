package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número inteiro: ");
        int num = scan.nextInt();

        int div = 0;
        boolean primo;

        System.out.printf("Os números primos entre 1 e %d são: ", num);
        for (int i = 2; i <= num; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                div ++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.printf("[%d] ", i);
            }
        }
        System.out.printf("\nNúmero de divisões: %d", div);

        scan.close();
    }
}