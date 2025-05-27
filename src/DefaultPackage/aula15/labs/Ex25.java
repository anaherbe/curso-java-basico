package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? (S/N)");
        String resposta1 = scan.next();

        System.out.println("Esteve no local do crime? (S/N)");
        String resposta2 = scan.next();

        System.out.println("Mora perto da vítima? (S/N)");
        String resposta3 = scan.next();

        System.out.println("Devia para a vítima? (S/N)");
        String resposta4 = scan.next();

        int classificacao = 0;

        if (resposta1.equalsIgnoreCase("S")) {
            classificacao++;            
        }

        if (resposta2.equalsIgnoreCase("S")) {
            classificacao++;            
        }

        if (resposta3.equalsIgnoreCase("S")) {
            classificacao++;            
        }

        if (resposta4.equalsIgnoreCase("S")) {
            classificacao++;            
        }

        if (classificacao == 2) {
            System.out.println("Suspeita.");
        } else if (classificacao == 3 || classificacao == 4) {
            System.out.println("Cúmplice.");
        } else if (classificacao == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente.");
        }

        scan.close();
    }
}