package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Quantos números deseja inserir? ");
        int quantidade = scan.nextInt();

        int num = 0;
        int maior = 0;
        int menor = 0;
        int soma = 0;

        for (int i = quantidade ; i > 0; i--) {

            System.out.printf("Insira o número %d: ", i);
            num = scan.nextInt();

            soma += num;

            if (i == quantidade) {
                menor = num;
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

        }
        
        System.out.printf("\n O maior número é: %d", maior);
        System.out.printf("\n O menor número é: %d", menor);
        System.out.printf("\n A soma dos números é: %d \n", soma);

        scan.close();
    }
}