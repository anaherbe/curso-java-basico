package DefaultPackage.aula17.labs;

import java.util.Objects;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String user = "";
        String password = "";

        while(Objects.equals(user, password)){
            System.out.printf("Insira seu usuário: ");
            user = scan.nextLine();

            System.out.printf("Insira sua senha: ");
            password = scan.nextLine();

            if(Objects.equals(user, password)){
                System.out.println("Entradas inválidas. Digite novamente");
            }

        } 

        System.out.println("Entradas válidas");

        scan.close();
    }
}