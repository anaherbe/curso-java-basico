package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean valida = false;
        String nome, estadocivil, genero;
        int idade;
        double salario;

        do {
            System.out.printf("Insira seu nome: ");
            nome = scan.nextLine();
            if (nome.length() > 3) {
                valida = true;
            } else {
                System.out.println("Entrada inválida. O nome precisa ter pelo menos três caracteres.");
            }
        } while(!valida);

        do {
            System.out.printf("Insira sua idade: ");
            idade = scan.nextInt();
            if (idade > 0 || idade < 150) {
                valida = true;
            } else {
                System.out.println("Entrada inválida. A idade precisa ser maior que 0 e menor que 150");
            }
        } while (!valida);

        do {
            System.out.printf("Insira seu salário: R$");
            salario = scan.nextDouble();
            if (salario > 0) {
                valida = true;
            } else {
                System.out.println("Entrada inválida. O salário precisa ser maior que R$ 0.");
            }
        } while (!valida);

        do {
            System.out.printf("Insira seu gênero ( M - F ): ");
            genero = scan.next();
            if (genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")) {
                valida = true;
            } else {
                System.out.println("Insira uma entrada válida");
            }
        } while (!valida);

        do {
            System.out.printf("Insira seu estado civil ( S - C - V - D ): ");
            estadocivil = scan.next();
            if (estadocivil.equalsIgnoreCase("s") || 
                estadocivil.equalsIgnoreCase("c") ||
                estadocivil.equalsIgnoreCase("v") ||
                estadocivil.equalsIgnoreCase("d")) {
                valida = true;
            } else {
                System.out.println("Insira uma entrada válida");
            }
        } while (!valida);

        System.out.println("Informações: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Estado civil: " + estadocivil);

        scan.close();
    }
}