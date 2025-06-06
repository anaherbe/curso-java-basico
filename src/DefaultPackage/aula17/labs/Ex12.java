package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número inteiro: ");
        int num = scan.nextInt();

        int multiplicador = 1;
        int resultado = 0;

        System.out.printf("Tabuada de %d:", num);

        for ( ; multiplicador <= 10; multiplicador++) {
            resultado = num * multiplicador;
            System.out.printf("\n %d * %d = %d", num, multiplicador, resultado);
        }

        scan.close();
    }
}