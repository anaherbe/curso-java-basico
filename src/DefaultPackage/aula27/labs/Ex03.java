package DefaultPackage.aula27.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.printf("Insira o nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.printf("Insira o curso do aluno: ");
        aluno.curso = scan.nextLine();

        System.out.printf("Insira o código de matrículo do aluno: ");
        aluno.matricula = scan.nextLine();

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.print("Disciplina: ");
            aluno.disciplinas[i] = scan.next();
            System.out.print("Insira a nota: ");
            aluno.notas[i] = scan.nextDouble();
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - reprovado");
            }
        }
        scan.close();
    }
}