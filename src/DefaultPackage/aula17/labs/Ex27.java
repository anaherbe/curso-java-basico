package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira a quantidade de turmas: ");
        int qtdTurma = scan.nextInt();

        int qtdAluno = 0;

        int media = 0;

        for (int i = 1; i <= qtdTurma; i++) {
            do {
                System.out.printf("Insira a quantidade de alunos da turma %d: ", i);
                qtdAluno = scan.nextInt();
            if (qtdAluno < 1 || qtdAluno > 40) {
                System.out.println("O número de alunos é inválido.");
            }
            } while (qtdAluno < 1 || qtdAluno > 40);

            media += qtdAluno;

        }

        media = media / qtdTurma;

        System.out.printf("O número médio de alunos por turma é: %d", media);

        scan.close();
    }
}