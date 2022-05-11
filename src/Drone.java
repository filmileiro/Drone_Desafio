import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Drone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = 0;
        int X = 0;


        System.out.print("Entre com o comando: ");
        String entrada = sc.nextLine();

        if (entrada.matches(".*[xX]\\d+")) {
            System.out.printf("(999, 999)");
        } else {
            Boolean continuar = true;
            while (continuar == true) {
                String removendoX = entrada.replaceAll("[a-zA-Z&&[^xX]][xX]", "");
                continuar = !removendoX.equals(entrada);
                entrada = removendoX.toUpperCase();
            }

            entrada = entrada.replaceAll("[a-zA-Z]\\d+[xX]{1}", "");


            String comandos = entrada.replaceAll("[a-zA-Z]+$", "");
            String comandos2 = entrada.replaceAll("[a-zA-Z]+[0-9]+", "");
            String comandos3 = entrada.replaceAll("^[0-9]+[xX]*", "");



            //N123LSX
            //N123LN123
            //N123LXN123

            System.out.println(comandos3);

            String[] numericos = comandos3.split("[N]");


            System.out.println(Arrays.toString(numericos));



















        }


    }

}
