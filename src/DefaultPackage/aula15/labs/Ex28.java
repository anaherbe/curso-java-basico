package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o tipo de carne: ");
        System.out.println("1 - File duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = scan.nextInt();

        System.out.println("Insira a quantidade em Kg: ");
        double qtd = scan.nextDouble();

        double precoKg = 0;

        if (tipo == 1) {
            System.out.println(qtd + "kg - file duplo");
            if (qtd < 5) {
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }

        } else if (tipo == 2){
            System.out.println(qtd + "kg - alcatra");

            if (qtd < 5) {
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tipo == 3){
            System.out.println(qtd + "kg - picanha");

            if (qtd < 5){
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        }

        double total = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? Se sim digite 1: ");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println(" Valor a pagar: " + total);
        }
    
        scan.close();
    
    }
}