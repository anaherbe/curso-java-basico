package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        for(double nota = 0 ; nota == 0 ; ){

            System.out.printf("Insira uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

            if(nota <= 0 || nota > 10){
                System.out.println("A nota é inválida. Digite novamente.");
                nota = 0;
            } else {
                System.out.println("A nota digitada foi: " + nota);
            }
        }

        scan.close();

    }
}