package DefaultPackage.aula17.labs;

public class Ex04 {
    public static void main(String[] args) {

        int populacaoA = 80000;
        int populacaoB = 200000;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA +=(populacaoA/100) * 3;
            populacaoB += (populacaoB/100) * 1.5;
            anos++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Quantidade de anos: " + anos);
        
    }
}