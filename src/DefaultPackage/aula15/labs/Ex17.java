package DefaultPackage.aula15.labs;

import java.time.Year;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um ano: ");
        int ano = scan.nextInt();

        if (Year.isLeap(ano)){
            System.out.println(ano + " é um ano bissexto");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }

        scan.close();

    }
}