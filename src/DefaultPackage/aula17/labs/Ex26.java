package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o número total de eleitores: ");
        int eleitores = scan.nextInt();

        System.out.printf("Os candidatos possíveis são ( 1 - 2 - 3 )\n");

        int voto = 0;

        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int i = 1; i <= eleitores; i++) {
            System.out.printf("Insira o voto da pessoa %d: ", i);
            voto = scan.nextInt();
            switch (voto) {
                case 1:
                    total1 += voto;
                    break;
                case 2:
                    total2 += voto;
                    break;
                case 3:
                    total3 += voto;
                    break;
            }
        }

        System.out.printf("\nNúmero total de votos do candidato 1: %d", total1);
        System.out.printf("\nNúmero total de votos do candidato 2: %d", total2);
        System.out.printf("\nNúmero total de votos do candidato 3: %d", total3);
        
        scan.close();
    }
}