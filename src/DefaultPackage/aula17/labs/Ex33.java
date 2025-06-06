package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.printf("Deseja inserir a temperatura?");
            resposta = scan.nextLine();



        } while (resposta.equalsIgnoreCase(resposta));


        scan.close();
    }
}