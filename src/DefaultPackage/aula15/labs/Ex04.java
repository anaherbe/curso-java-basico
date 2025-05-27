package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        System.out.println("Insira uma letra:");
        char letra = scan.next().charAt(0);

        boolean isVogal = false;
        for(char vogal : vogais){
            if (letra == vogal){
                isVogal = true;
                break;
            }
        }

        if (Character.isLetter(letra)){
            if (isVogal){
                System.out.println(letra + " é uma vogal");
            } else {
                System.out.println(letra + " é uma consoante");
            }
        } else {
            System.out.println("Insira uma letra válida.");
        }

        scan.close();
    }
}