package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor ganho por hora?");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês?");
        double qtdHoras = scan.nextDouble();

        double salario = valorHora * qtdHoras;

        System.out.println("O seu salário é: " + salario);

        scan.close();
    }

}
