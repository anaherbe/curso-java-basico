package DefaultPackage.aula17.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num1 = 1;
        int num2 = 1;

        while (num1 <= 20) {
            System.out.println(num1);
            num1 ++;
        }

        while (num2 <= 20) {
            System.out.printf("%d ", num2);
            num2 ++;
        }

        scan.close();
        
    }
}