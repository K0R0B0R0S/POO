package questao.quatro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma String que contenha números separados pelo caractere '#'");
        String cadeia = sc.nextLine();
        try {
            double media = MeuNumero.media(cadeia);
            System.out.println("A média é: " + media);
        }catch (NumeroNegativoException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
