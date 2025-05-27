package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira a quantidade de litro vendida: ");
        double litros = scan.nextDouble();

        System.out.printf("Insira o tipo de combustível: ");
        String tipo = scan.next();

        double precoG = 2.50;
        double precoA = 1.90;
        double percentualD = 0;
        double total = 0;
        double totalD = 0;

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
               percentualD = 3; 
            } else {
                percentualD = 5;
            }

            total = litros * precoA;

        } else if ( tipo.equalsIgnoreCase("g")){
            if (litros <= 20) {
                percentualD = 4;
            } else {
                percentualD = 6;
            }

            total = litros * precoG;
        }

        totalD = (total / 100) * percentualD;

        double pagar = total - totalD;

        System.out.println("Valor a ser pago: " + pagar);

        scan.close();
    }
}