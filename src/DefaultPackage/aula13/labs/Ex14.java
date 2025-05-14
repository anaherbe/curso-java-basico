package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o peso de peixes: ");
        double peso = scan.nextDouble();

        double excedente = 0;
        double multa = 0;

        if (peso > 50){
            excedente = peso - 50;
            multa = excedente * 4;
            System.out.printf("O peso de %.2f excede o estabelecido pelo regulamento de pesca do estado de SP, você deve pagar uma multa de %.2f reais", peso, multa);
        } else {
            System.out.printf("O peso de %.2f não excede o estabelecido pelo regulamento de pesca do estado de SP, você deve pagar uma multa de %.2f reais", peso, multa);
        }

        scan.close();
    }
}