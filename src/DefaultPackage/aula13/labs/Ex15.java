package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor ganho por hora?");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês?");
        double qtdHoras = scan.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O seu salário bruto é: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato " + sindicato);
        System.out.println("Imposto de renda: " + ir);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário lìquido: " + salarioLiquido);

        scan.close();
    }
}