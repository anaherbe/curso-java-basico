package DefaultPackage.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }

        System.out.println("Insira o valor do item");
        double valor = scan.nextDouble();
        if (valor <= 10){
            System.out.println("Está barato!");
        } else if (valor > 10 && valor < 15){
            System.out.println("Você pode pedir um desconto!");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Pode pesquisar mais!");
        } else {
            System.out.println("Muito caro!");
        }
        
        scan.close();
    }
}
