package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o primeiro número: ");
        double num1 = scan.nextDouble();

        System.out.printf("Insira o segundo número: ");
        double num2 = scan.nextDouble();

        System.out.printf("Insira a operação: ");
        System.out.printf("\n 1 - Soma");
        System.out.printf("\n 2 - Subtração");
        System.out.printf("\n 3 - Divisão");
        System.out.printf("\n 4 - Multiplicação \n");
        int operacao = scan.nextInt();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 / num2;
                break;

            case 4:
                resultado = num1 * num2;
                break;

            default:
                System.out.println("Operação inválida.");
                valida = false;

        }

        String sinal;
        String parImpar;
        String inteiroDecimal;

        if (valida){
            

            if (resultado >=0){
                sinal = "positivo";
            } else {
                sinal = "negativo";
            }
            
            if (resultado % 2 == 0){
                parImpar = "par";
            }else {
                parImpar = "impar";
            }

            if(resultado == Math.round(resultado)){
                inteiroDecimal = "inteiro";
                System.out.println("Resultado: " + (int)resultado + ", " + sinal + ", " + parImpar + " e " + inteiroDecimal + ".");
            } else{
                inteiroDecimal = "decimal";
                System.out.println("Resultado: " + resultado + ", " + sinal + ", " + parImpar + " e " + inteiroDecimal + ".");
            }

        }

        scan.close();
    }
}