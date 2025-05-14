package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o tamanho da área a ser pintada em m²:");
        double area = scan.nextDouble();

        double latas = (area / 3 / 18);

        int valor = 80;

        System.out.println("A quantidade de latas de tinta a serem compradas é: " + Math.round(Math.ceil(latas)));
        System.out.println("O preço total será de: R$" + Math.round(Math.ceil(latas)) * valor);

        scan.close();
    }
}