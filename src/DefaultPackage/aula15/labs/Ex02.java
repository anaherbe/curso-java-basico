package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o segundo número: ");
        int num = scan.nextInt();

        if (num >= 0){
            System.out.println("O número " + num + " é positivo");
        } else {
            System.out.println("O número " + num + " é negativo");
        }

        scan.close();
    }
}