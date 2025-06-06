package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número inteiro: ");
        int num = scan.nextInt();

        int resultado = 1;
        StringBuilder output = new StringBuilder();

        output.append(num).append("! = ");

        for (int i = num; i > 0; i--) {
            if (i != num && i != 1) {
                output.append(" * ").append(i);
            } else if (i == num){
                output.append(num);
            } else {
                output.append(" * ").append(i);
            }
            resultado *= i;
        }

        output.append(" = ").append(resultado);
        
        System.out.printf(output.toString());

        scan.close();
    }
}