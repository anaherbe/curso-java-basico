package DefaultPackage.aula15.labs;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um número entre 0 e 1000: ");
        int num = scan.nextInt();

        if(num < 0 || num >= 1000){
            System.out.println("Número inválido!");
            scan.close();
            return;
        }

        int centenas = num / 100;
        int dezenas = (num % 100) / 10;
        int unidades = num % 10;

        if (num == 0){
            System.out.println("Zero.");
            scan.close();
            return;
        }

        String resultado = "";

        if (centenas > 0){
            resultado += centenas + " centena";
            if(centenas > 1){
                resultado += "s";
            }
        }

        if (dezenas > 0){
            if (!resultado.isEmpty()){
                if (unidades > 0){
                    resultado += ", ";
                } else {
                    resultado += " e ";
                }
            }
            resultado += dezenas + " dezena";
            if (dezenas > 1){
                resultado += "s";
            }
        }

        if(unidades > 0){
            if(!resultado.isEmpty()){
                resultado += " e ";
            }
            resultado += unidades + " unidade";
            if(unidades > 1){
                resultado += "s";
            }
        }

        System.out.println(num + " = " + resultado + ".");

        scan.close();
       
    }
}