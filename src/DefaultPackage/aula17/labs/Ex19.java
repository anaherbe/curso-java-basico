package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int quantidade;

        do {
            System.out.printf("Quantos números deseja inserir? ");
            quantidade = scan.nextInt();
            if(quantidade <= 0 || quantidade > 1000){
            System.out.println("A quantidade é inválida. Digite novamente.");
            } else {
            System.out.println("A quantidade digitada foi: " + quantidade);
            }
        } while (quantidade <= 0 || quantidade > 1000);

        for (int i = 1 ; i <= quantidade; i++) {

            do {

                System.out.printf("Insira o número %d: ", i);
                num = scan.nextInt();

                if(num <= 0 || num > 1000){
                    System.out.println("A quantidade é inválida. Digite novamente.");
                }else {

                    soma += num;

                    if (i == num) {
                        menor = num;
                    }

                    if (num > maior) {
                        maior = num;
                    }

                    if (num < menor) {
                        menor = num;
                    }

                }

            } while (num <= 0 || num > 1000);

        }
        
        System.out.printf("\n O maior número é: %d", maior);
        System.out.printf("\n O menor número é: %d", menor);
        System.out.printf("\n A soma dos números é: %d \n", soma);

        scan.close();
    }
}