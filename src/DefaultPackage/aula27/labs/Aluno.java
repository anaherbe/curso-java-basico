package DefaultPackage.aula27.labs;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[] notas = new double[disciplinas.length];

    void mostrarInfo(){
        System.out.println("\nNome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota da disciplina " + disciplinas[i] + ": " + notas[i]);
            System.out.println();
        }

    }

    boolean verificarAprovado(int indice) {
        do {
            if (notas[indice] >= 7) {
                indice++;
                return true;
            } else {
                indice++;
                return false;
            }
        } while (indice < notas.length);
    }
}