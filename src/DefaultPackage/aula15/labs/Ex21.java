package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Informe o valor do saque: ");
        int valorSaque = scan.nextInt();

        
        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("O valor do saque deve estar entre 10 e 600 reais.");
            scan.close();
            return;
        }

        int saque = valorSaque;

        int cem = saque / 100;
        saque %= 100; 
        int cinquenta = saque / 50;
        saque %= 50; 
        int dez = saque / 10;
        saque %= 10; 
        int cinco = saque / 5;
        saque %= 5; 
        int um = saque;

        String notas = "";

        if (cem > 0) {
            notas += cem + " nota";
            if (cem > 1) {
                notas += "s";
            }
            notas += " de cem";
        }

        if (cinquenta > 0) {
            if (!notas.isEmpty()) {
                notas += ", ";
            }
            notas += cinquenta + " nota";
            if (cinquenta > 1) {
                notas += "s";
            }
            notas += " de cinquenta";
        }

        if (dez > 0) {
            if (!notas.isEmpty()) {
                notas += ", ";
            }
            notas += dez + " nota";
            if (dez > 1) {
                notas += "s";
            }
            notas += " de dez";
        }

        if (cinco > 0) {
            if (!notas.isEmpty()) {
                notas += ", ";
            }
            notas += cinco + " nota";
            if (cinco > 1) {
                notas += "s";
            }
            notas += " de cinco";
        }

        if (um > 0) {
            if (!notas.isEmpty()) {
                notas += " e ";
            }
            notas += um + " nota";
            if (um > 1) {
                notas += "s";
            }
            notas += " de um";
        }

        System.out.println(valorSaque + " = " + notas + ".");
        scan.close();
    }
}