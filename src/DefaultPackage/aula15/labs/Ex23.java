package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double num;

        System.out.printf("Insira um número: ");
        num = scan.nextDouble();

        if(num == Math.round(num)){
            System.out.printf("%d é um número inteiro", (int)num);
        } else{
            System.out.printf("%.2f é um número decimal", num);
        }

        scan.close();

    }
}