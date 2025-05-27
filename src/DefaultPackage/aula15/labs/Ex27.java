package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a quantidade de maçãs compradas em Kg: ");
        double qtdMaca = scan.nextDouble();

        System.out.println("Insira a quantidade de morangos comprados em Kg: ");
        double qtdMorango = scan.nextDouble();

        double precoMaca = 0;
        if (qtdMaca <= 5) {
            precoMaca = 1.50;
        } else {
            precoMaca = 1.80;
        }

        double precoMorango = 0;
        if (qtdMorango <= 5) {
            precoMorango = 2.20;
        } else {
            precoMorango = 2.50;
        }

        double totalMaca = qtdMaca * precoMaca;
        double totalMorango = qtdMorango * precoMorango;

        double pagar = totalMaca + totalMorango;
        double pagarD = pagar;

        if (precoMaca + precoMorango > 8 || pagar > 25) {
            pagarD = pagar - ((pagar / 100) * 10);
        }

        System.out.println("Valor a ser pago: " + pagarD);

        scan.close();
    }
}