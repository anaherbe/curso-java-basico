package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um númer inteiro: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }

        scan.close();
    }
}