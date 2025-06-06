package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira a quantidade de CDs da coleção: ");
        int cds = scan.nextInt();

        double valor = 0;

        double media = 0;

        for (int i = 1; i <= cds; i++) {
            System.out.printf("Insira o valor do CD %d: ", i);
            valor = scan.nextDouble();
            media += valor;
        }

        media = media / cds;

        System.out.printf("\nValor total investido: %.2f", media);

        scan.close();
    }
}