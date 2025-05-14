package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a nota do primeiro bimestre: ");
        double nota1 = scan.nextDouble();

        System.out.println("Insira a nota do segundo bimestre: ");
        double nota2 = scan.nextDouble();

        System.out.println("Insira a nota do terceiro bimestre: ");
        double nota3 = scan.nextDouble();

        System.out.println("Insira a nota do quarto bimestre: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média é: " + media);

        scan.close();
    }
}