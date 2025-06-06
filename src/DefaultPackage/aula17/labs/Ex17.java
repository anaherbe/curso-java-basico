package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número: ");
        int num = scan.nextInt();

        int fatorial = num - 1;

        for ( ; 1 < fatorial; fatorial--) {
            num *= fatorial;
            
        }

        System.out.printf("Fatorial: %d", num);

        scan.close();
    }
}