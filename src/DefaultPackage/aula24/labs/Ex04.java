package DefaultPackage.aula24.labs;

import java.util.Date;

public class Ex04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Jogos Vorazes";
        livro.autor = "Suzanne Collins";
        livro.genero = "Distopia";
        livro.qtdPaginas = 400;
        livro.anoLancamento = 2010;
        livro.isbn = "978-8579800245";

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Ana";
        
        System.out.println("Nome do livro: " + livro.nome);
    }   
}