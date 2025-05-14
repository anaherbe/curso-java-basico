package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scan.nextInt();

        System.out.println("O número informado foi " + numero);

        scan.close();
    }
}