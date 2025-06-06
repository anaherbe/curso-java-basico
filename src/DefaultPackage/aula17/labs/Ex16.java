package DefaultPackage.aula17.labs;

public class Ex16 {
    public static void main(String[] args) {

        int numero = 650;

        int num;
        int num1 = 0;

        for (int num2 = 1; num2 < numero;) {
            num = num1 + num2;
            num1 = num2;
            num2 = num;

            if (num2 < numero) {
                System.out.print(num2 + " ");
            }
        }
    }
}