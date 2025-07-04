package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor ganho por hora?");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês?");
        double qtdHoras = scan.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        int percentualIR = 0;
        if (salarioBruto <= 900){
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto < 1500){
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto < 2500){
            percentualIR = 10;
        } else if (salarioBruto > 2500){
            percentualIR = 20;
        }

        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double ir = (salarioBruto / 100) * percentualIR;
        double totalDescontos = inss + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + "): " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%):" + ir);
        System.out.println("(-) INSS (10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Liquido: " + salarioLiquido);

        scan.close();
    }
}