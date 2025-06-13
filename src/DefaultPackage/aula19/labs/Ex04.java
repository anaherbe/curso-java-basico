package DefaultPackage.aula19.labs;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] elementosA = new int[15];

        double[] elementosB = new double[elementosA.length];

        for (int i=0; i<elementosA.length; i++){
            
            System.out.printf("Insira o valor da posição [%d]:  ", i);
            elementosA[i] = scan.nextInt();
            
            elementosB[i] = Math.sqrt(elementosA[i]);
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<elementosA.length; i++){
            System.out.print(elementosA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");
        
        System.out.print("Vetor B = ");
        for (int i=0; i<elementosB.length; i++){
            System.out.print(df.format(elementosB[i]) + " ");
        }
        System.out.println();

        scan.close();

    }
}