package DefaultPackage.aula19.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] elementosA = new int[8];

        int[] elementosB = new int[elementosA.length];

        for (int i=0; i<elementosA.length; i++){
            
            System.out.printf("Insira o valor da posição [%d]:  ", i);
            elementosA[i] = scan.nextInt();
            
            elementosB[i] = elementosA[i] * 2;
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<elementosA.length; i++){
            System.out.print(elementosA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int i=0; i<elementosB.length; i++){
            System.out.print(elementosB[i] + " ");
        }
        System.out.println();

        scan.close();
    }
}