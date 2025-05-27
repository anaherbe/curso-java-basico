package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro lado do triângulo: ");
        double lado1 = scan.nextDouble();

        System.out.println("Insira o segundo lado do triângulo: ");
        double lado2 = scan.nextDouble();

        System.out.println("Insira o terceiro lado do triângulo: ");
        double lado3 = scan.nextDouble();

        // boolean maior1 = lado1 > lado2 && lado1 > lado3;
        // boolean maior2 = lado2 > lado1 && lado2 > lado3;
        // boolean maior3 = lado3 > lado1 && lado3 > lado2;

        boolean menor1 = lado1 < lado2 && lado1 < lado3;
        boolean menor2 = lado2 < lado1 && lado2 < lado3;
        boolean menor3 = lado3 < lado1 && lado3 < lado2;

        double somaLados = 0;
        double isTriangulo = 0;

        // if (maior1) {
        //     somaLados = lado2 + lado3;
        //     isTriangulo = lado1 - somaLados;
        // } else if (maior2){
        //     somaLados = lado1 + lado3;
        //     isTriangulo = lado2 - somaLados;
        // } else if (maior3){
        //     somaLados = lado1 + lado2;
        //     isTriangulo = lado3 - somaLados;
        // } else 
        
        if (menor1) {
            somaLados = lado2 + lado3;
            isTriangulo = somaLados - lado1;
        } else if (menor2){
            somaLados = lado1 + lado3;
            isTriangulo = somaLados - lado2;
        } else if (menor3){
            somaLados = lado1 + lado2;
            isTriangulo = somaLados - lado3;
        }

        if (isTriangulo > 0){
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isóceles");
            }

        } else {
            System.out.println("não forma um triângulo");
        }

        scan.close();
    }
}