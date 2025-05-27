package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o número do dia da semana ( 1 - 2 - 3 - 4 - 5 - 6 - 7): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("1")) {
            System.out.println("\nDomingo");
        } else if (input.equalsIgnoreCase("2")) {
            System.out.println("\nSegunda");
        } else if (input.equalsIgnoreCase("3")) {
            System.out.println("\nTerça"); 
        } else if (input.equalsIgnoreCase("4")) {
            System.out.println("\nQuarta");
        } else if (input.equalsIgnoreCase("5")) {
            System.out.println("\nQuinta");
        } else if (input.equalsIgnoreCase("6")) {
            System.out.println("\nSexta");
        } else if (input.equalsIgnoreCase("7")) {
            System.out.println("\nSábado");
        } else {
            System.out.println("Digite uma entrada válida.");
        }

        scan.close();

    }
}
