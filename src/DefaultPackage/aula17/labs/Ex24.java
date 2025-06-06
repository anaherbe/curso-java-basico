package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira a quantidade de notas da média: ");
        double qtd = scan.nextDouble();

        double media = 0;

        double notas = 0;

        for (int i = 1; i <= qtd; i++) {
            System.out.printf("Insira a nota %d: ", i);
            notas = scan.nextDouble();
            media += notas;
        }

        media = media / qtd;
        
        System.out.printf("A média das notas é: %.2f", media);

        scan.close();
    }
}