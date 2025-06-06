package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira a quantidade de pessoas: ");
        int pessoas = scan.nextInt();

        int idade = 0;
        
        int media = 0;

        for (int i = 1; i <= pessoas; i++) {
            System.out.printf("Insira a idade da pessoa %d: ", i);
            idade = scan.nextInt();
            media += idade;
        }

        media = media / pessoas;

        if (media < 26) {
            System.out.println("Classificação da turma: jovem");
        } else if (media >= 26) {
            System.out.println("Classificação da turma: adulta");
        } else if (media >= 61) {
            System.out.println("Classificação da turma: idosa");
        }

        scan.close();
    }
}