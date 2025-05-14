package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a temperatura em grau Fahrenheit?");
        double fahrenheit = scan.nextDouble();

        double celsius = (5 * (fahrenheit - 32) / 9);

        System.out.println("A temperatura " + fahrenheit + "F é igual a " + celsius + " C");

        scan.close();
    }
}