package DefaultPackage.aula19.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] elementosA = new int[5];

        int[] elementosB = new int[elementosA.length];

        for (int i=0; i<elementosA.length; i++){
            
            System.out.printf("Insira o valor da posição [%d]:  ", i);
            elementosA[i] = scan.nextInt();
            
            elementosB[i] = elementosA[i];
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