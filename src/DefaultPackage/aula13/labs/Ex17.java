package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o tamanho da área a ser pintada em m²:");
        double area = scan.nextDouble();

        double latas = (area / 6 / 18);
        double galoes = (area / 6 / 3.6);

        System.out.println("Quantidade de latas a comprar usando apenas latas: " + Math.round(Math.ceil(latas)));
        long valorLata = Math.round((Math.ceil(latas))) * 80;
        System.out.println("Valor a pagar: R$" + valorLata);

        System.out.println("Quantidade de galões a comprar usando apenas galões: " + Math.round(Math.ceil(galoes)));
        long valorGalao = Math.round((Math.ceil(galoes))) * 25;
        System.out.println("Valor a pagar: R$" + valorGalao);

        double latasBarato = 0;
        double galoesBarato = 0;

        do { 
            if (area >= 65) {
                latasBarato++;
                area -= 108;
            } else if (area > 0) {
                galoesBarato++;
                area -= 21.6;
            }
        } while (area > 0);

        System.out.println("\nLatas a comprar: " + latasBarato);
        System.out.println("Galões a comprar: " + galoesBarato);
        System.out.println("Total a pagar: R$" + (Math.round(Math.ceil(latasBarato)) * 80 + Math.round(Math.ceil(galoesBarato)) * 25));
        double areaPositiva = Math.abs(area);
        System.out.printf("Sobra de tinta: %.2fm²", areaPositiva);

        scan.close();
    }

}