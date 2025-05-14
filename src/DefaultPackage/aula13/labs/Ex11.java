package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro");
        int num1 = scan.nextInt();

        System.out.println("Informe o segundo número inteiro");
        int num2 = scan.nextInt();

        System.out.println("Informe um número real");
        double num3 = scan.nextDouble();

        int resultadoA = (num1 * 2) * (num2 / 2);

        double resultadoB = (num1 * 3) + num3;

        double resultadoC = Math.pow(num3, 3);

        System.out.println("O resultado do produto do dobro do primeiro com metade do segundo é: " + resultadoA);

        System.out.println("O resultado da soma do triplo do primeiro com o terceiro é: " + resultadoB);

        System.out.println("O resultado do terceiro elevado ao cubo é: " + resultadoC);

        scan.close();
        
    }
}