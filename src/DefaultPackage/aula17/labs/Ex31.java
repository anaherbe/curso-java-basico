package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        do {

            System.out.printf("\nLojas Tabajara");

            double preco = 1;

            double total = 0;

            double dinheiro;

            double troco;

            for (int i = 1; preco != 0;  i++) {
                System.out.printf("\nProduto %d: R$ ", i);
                preco = scan.nextDouble();
                total += preco;
            }

            System.out.printf("\nTotal: R$%.2f\n", total);

            System.out.printf("\nDinheiro: R$");
            dinheiro = scan.nextDouble();

            troco = dinheiro - total;
            System.out.printf("\nTroco: R$ %.2f\n", troco);

        } while (true);
    }
}