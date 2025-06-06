package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;
        int fatorial;
        int resposta;

        do {

            fatorial = 1;

            do{ 
                System.out.printf("Insira um número inteiro positivo e menor que 16: ");
                num = scan.nextInt();
                if (num <= 0 || num > 16) {
                    System.out.println("Número inválido. Digite novamente");
                }
            } while (num <= 0 || num > 16);
    
            fatorial = num - 1;
            for ( ; 1 < fatorial; fatorial--) {
                num *= fatorial;
            }

            System.out.printf("Fatorial = %d", num);

            System.out.println("\nDigite 1 para calcular outro fatorial e 2 para finalizar.");
            resposta = scan.nextInt();

        } while (resposta == 1);

        scan.close();
    }
}