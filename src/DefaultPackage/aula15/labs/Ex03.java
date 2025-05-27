package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu gênero? Insira (F) para feminino e (M) para masculino:");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("M - masculino");
        } else {
            System.out.println("Digite uma entrada válida.");
        }

        scan.close();
    }
}