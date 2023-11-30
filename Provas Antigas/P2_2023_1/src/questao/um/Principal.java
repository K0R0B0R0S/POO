package questao.um;

import java.util.Scanner;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigo = sc.nextLine();
        sc.close();

        Pais x = new Pais(codigo);
        // List<Pais> lista = CriaPais.retornaPais(); // Listagem Hardcoded
        String[] dados = {
                "001#CidadeA#100#50000",
                "002#CidadeB#150#75000",
                "003#CidadeC#120#60000",
        };
        try {
            List<Pais> lista = CriaPais.retornaPais(dados);
            if (lista.contains(x)) {
                int index = lista.indexOf(x);
                Pais p = (Pais) lista.get(index);
                System.out.println("Nome: " + p + " Densidade: " + p.getDensidade() + " Fronteira: " + p.getFronteira());
            } else {
                System.out.println("Pais não existe");
            }
        } catch (FormatoIncorretoException e) {
            System.out.println(e.getMessage());
        }
    }
}
