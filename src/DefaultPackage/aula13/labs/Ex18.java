package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o tamanho do arquivo para download em MB:");
        double tamArquivo = scan.nextDouble();

        System.out.println("Insira a velocidade da internet em Mbps:");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download: " + tempo);

        scan.close();
    }

}