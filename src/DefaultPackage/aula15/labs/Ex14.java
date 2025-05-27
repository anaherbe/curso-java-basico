package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A primeira nota foi : " + nota1);
        System.out.println("A segunda nota foi : " + nota2);
        System.out.println("A média das notas é: " + media);
        
        char conceito = ' ';
        if (media >= 9 && media <= 10){
            conceito = 'A';
            System.err.println("O conceito da média é: " + conceito);
        } else if (media >= 7.5 && media < 9){
            conceito = 'B';
            System.err.println("O conceito da média é: " + conceito);
        } else if (media >= 6 && media < 7.5){
            conceito = 'C';
            System.err.println("O conceito da média é: " + conceito);
        } else if (media >= 4 && media < 6){
            conceito = 'D';
            System.err.println("O conceito da média é: " + conceito);
        } else if (media >= 0 && media < 4){
            conceito = 'E';
            System.err.println("O conceito da média é: " + conceito);
        }

        switch (conceito) {
            case 'A':
            case 'B':
            case 'C': System.out.println("Aprovado");break;
            case 'D':
            case 'E': System.out.println("Reprovado");break;
        }

        scan.close();
    }
}