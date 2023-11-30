package questao.dois;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        sc.close();
        
        try {
            Utils.verifica(frase);
            System.out.println(Utils.moderar(frase));
        } catch (TextoCurtoException e) {
            System.out.println(e.getMessage());
        }

    }
}
