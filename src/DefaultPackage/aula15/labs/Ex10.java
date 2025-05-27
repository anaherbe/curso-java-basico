package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o turno de estudo ( M - V - N): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("m")) {
            System.out.println("\nBom dia!");
        } else if (input.equalsIgnoreCase("v")) {
            System.out.println("\nBoa Tarde!");
        } else if (input.equalsIgnoreCase("n")) {
            System.out.println("\nBoa noite!"); 
        } else {
            System.out.println("Digite uma entrada válida.");
        }

        scan.close();

    }
}