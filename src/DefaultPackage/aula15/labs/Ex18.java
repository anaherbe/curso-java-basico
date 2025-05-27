package DefaultPackage.aula15.labs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        Date data = null;
        boolean dataValida = false;

        while (!dataValida) {
            System.out.println("Digite a data no formato (dd/mm/aaaa)");
            String input = scan.nextLine();

            try{
                data = sdf.parse(input);
                dataValida = true;
            } catch (ParseException e){
                System.out.println("Data inválida. Tente novamente.");
            }

        }

        System.out.println("Data válida: " + sdf.format(data));

        scan.close();

    }
}