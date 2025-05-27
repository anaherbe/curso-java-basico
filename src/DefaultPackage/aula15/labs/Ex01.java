package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int  num1 = scan.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número é maior:" + num1);
        } else if(num1 < num2) {
            System.out.println("O segundo número é maior:" + num2);
        } else {
            System.out.println("Os números são iguais!");
        }

        scan.close();
    }
}