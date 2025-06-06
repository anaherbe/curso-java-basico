package DefaultPackage.aula17.labs;

public class Ex29 {
    public static void main(String[] args) {

        double item = 1.99;

        int valorMaximo = 50;

        double resultado = 0;

        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int i = 1; i <= valorMaximo; i++) {

            resultado = item * i;

            System.out.printf("\n%d - R$ %.2f\n", i, resultado);

        }
    }
}