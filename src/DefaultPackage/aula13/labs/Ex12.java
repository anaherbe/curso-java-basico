package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua altura?");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);

        scan.close();
    }
}