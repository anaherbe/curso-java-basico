package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a temperatura em grau Celsius?");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura " + celsius + " C é igual a " + fahrenheit + " F");

        scan.close();
    }
}