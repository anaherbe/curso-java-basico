package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor de 'a': ");
        double valorA = scan.nextDouble();

        double valorB = 0;
        double valorC = 0;

        if (valorA != 0){

            System.out.println("Insira o valor de 'b': ");
            valorB = scan.nextDouble();


            System.out.println("insira o valor de 'c': ");
            valorC = scan.nextDouble();

        } else {

            System.out.println("Como 'a' é igual a 0 a equação não é de segundo grau.");

        }

        double delta = Math.pow(valorB, 2) - (4 * valorA * valorC);
        System.out.println("O valor de delta é: " + delta);

        if (delta > 0) {

            double x1 = ((-valorB) + Math.sqrt(delta)) / (2 * valorA);
            System.out.println("O valor de x1 é: " + x1);

            double x2 = ((-valorB) - Math.sqrt(delta)) / (2 * valorA);
            System.out.println("O valor de x2 é: " + x2);

        } else if (delta == 0){

            System.out.println("A equação possui apenas uma raíz real.");
            
        } else if (delta < 1) {

            System.out.println("A equação não possui raizes reais.");

        }

        scan.close();

    }
}