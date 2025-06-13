package DefaultPackage.aula24.labs;

public class Ex02 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "Jogos Vorazes";
        livro.autor = "Suzanne Collins";
        livro.genero = "Distopia";
        livro.qtdPaginas = 400;
        livro.anoLancamento = 2010;
        livro.isbn = "978-8579800245";

        System.out.println("Nome do livro: " + livro.nome);
    }
}