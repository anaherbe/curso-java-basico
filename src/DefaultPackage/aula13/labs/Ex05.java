package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor em metros: ");
        double metros = scan.nextDouble();

        double cent = metros * 100;

        System.out.println(metros + "m é igual a " + cent + "cm");

        scan.close();
    }
}