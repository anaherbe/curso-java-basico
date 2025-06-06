package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o preço do pão: ");
        double preco = scan.nextDouble();

        int valorMaximo = 50;

        double resultado = 0;

        System.out.printf("\nPreço do pão: R$ %.2f", preco);
        System.out.printf("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= valorMaximo; i++) {
            resultado = preco * i;

            System.out.printf("\n%d - R$ %.2f\n", i, resultado);
        }

        scan.close();
    }
}