package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira a base: ");
        int base = scan.nextInt();

        System.out.printf("Insira o expoente: ");
        int expoente = scan.nextInt();

        int resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}