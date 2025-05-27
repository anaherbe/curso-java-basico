package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o preço do primeiro produto: ");
        double produto1 = scan.nextDouble();

        System.out.printf("Insira o preço do segundo produto: ");
        double produto2 = scan.nextDouble();

        System.out.printf("Insira o preço do terceiro produto: ");
        double produto3 = scan.nextDouble();

        boolean menor1 = produto1 < produto2 && produto1 < produto2;
        boolean menor2 = produto2 < produto1 && produto2 < produto3;
        boolean menor3 = produto3 < produto1 && produto3 < produto2;

        if (menor1) {
            System.out.printf("\nO primeiro produto é o mais barato: %.2f", produto1);
        } else if (menor2){
            System.out.printf("\nO primeiro produto é o mais barato: %.2f", produto2);
        } else if (menor3){
            System.out.printf("\nO primeiro produto é o mais barato: %.2f", produto3);
        }

        boolean iguais = produto1 == produto2 && produto2 == produto3;

        if (iguais){
            System.out.printf("Os três produtos têm o mesmo preço", produto1);
        }
        
        scan.close();
    }
}
