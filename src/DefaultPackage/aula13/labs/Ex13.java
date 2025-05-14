package DefaultPackage.aula13.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua altura?");
        double altura = scan.nextDouble();

        System.out.println("Qual o seu peso?");
        double peso = scan.nextDouble();

        System.out.println("Qual o seu gênero?");
        System.out.println("Digite (1) para feminino e (2) para masculino");
        int genero = scan.nextInt();

        double pesoIdeal = 0;
        double diferenca = 0;

        switch (genero) {
            case 1:
                    pesoIdeal = (62.1 * altura) - 44.7;
                break;
        
            case 2:
                    pesoIdeal = (72.7 * altura) - 58;
                break;

        }

        if (peso > pesoIdeal){
            diferenca = peso - pesoIdeal;
            System.out.println("Você está acima do seu peso ideal por: " + diferenca);
        } else if (peso < pesoIdeal) {
            diferenca = pesoIdeal - peso;
            System.out.println("Você está abaixo do seu peso ideal por: " + diferenca);
        } else {
            System.out.println("Você está no seu peso ideal");
        }

        scan.close();
    }
}