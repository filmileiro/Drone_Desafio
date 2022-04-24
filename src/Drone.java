import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Drone {

    public static void main (String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("Entre com o comando: ");
        String entrada = sc.nextLine();

        //Uma string de entrada "NNNLLL" irá resultar em uma posição final "(3, 3)", assim como uma string "NLNLNL" irá resultar em "(3, 3)".
        //Caso o caractere X esteja presente, o mesmo irá cancelar a operação anterior.
        //Caso houver mais de um caractere X consecutivo, o mesmo cancelará mais de uma ação na quantidade em que o X estiver presente.
        //Uma string de entrada "NNNXLLLXX" irá resultar em uma posição final "(1, 2)" pois a string poderia ser simplificada para "NNL".

        Boolean continuar = true;

        while (continuar) {
            String resultado = entrada.replaceAll("[a-zA-Z&&[^xX]][xX]", "");
            continuar = !resultado.equals(entrada);
            entrada = resultado;
        }

        ArrayList<String> posicoes = new ArrayList<String>(Arrays.asList(entrada.toUpperCase().split("")));

        for (int i = 1; i < posicoes.size(); i++) {
            if (posicoes.get(i).equalsIgnoreCase("X") && posicoes.get(i-1).matches("[0-9]*")){
                posicoes.remove(i);
                posicoes.remove(i - 2 );
            }
        }

        System.out.println(posicoes);


    }

}
