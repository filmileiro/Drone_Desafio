import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o um valor: ");
        String entrada = sc.nextLine();
        String[] comando = entrada.split("");

        for (int i = comando.length-1; i >= 0  ; i--) {
            System.out.println(comando[i]);
        }



        sc.close();
    }

}
