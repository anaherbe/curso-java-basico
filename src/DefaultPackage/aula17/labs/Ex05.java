package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean valida = false; 
        double populacaoA, populacaoB, taxaA, taxaB;

        do {
            System.out.println("Insira a quantidade da população A: ");
            populacaoA = scan.nextDouble();
            if (populacaoA > 0) {
                valida = true;
            } else {
                System.out.println("Entrada inválida. A quantidade da população precisa ser maior que 0.");
            }
        } while (!valida);

        do {
            System.out.println("Insira a quantidade da população B: ");
            populacaoB = scan.nextDouble();
            if (populacaoB > 0) {
                valida = true;
            } else {
                System.out.println("Entrada inválida. A quantidade da população precisa ser maior que 0.");
            }
        } while (!valida);

        do {
            System.out.println("Insira a taxa de crescimento da população A: ");
            taxaA = scan.nextDouble();
            if (taxaA > 0) {
                valida = true;
            } else {
                System.out.println("Entrada inválida. A taxa de crescimento precisa ser maior que 0.");
            }
        } while (!valida);

        do {
            System.out.println("Insira a taxa de crescimento da população B: ");
            taxaB = scan.nextDouble();
            if (taxaB > 0) {
                valida = true;
            } else {
                System.out.println("Entrada inválida. A taxa de crescimento precisa ser maior que 0.");
            }
        } while (!valida);

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA +=(populacaoA/100) * taxaA;
            populacaoB += (populacaoB/100) * taxaB;
            anos++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Quantidade de anos: " + anos);

        scan.close();
    }
}