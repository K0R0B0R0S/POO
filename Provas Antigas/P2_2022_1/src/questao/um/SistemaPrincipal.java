package questao.um;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SistemaPrincipal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        Estrela e = new Estrela(id);

        Set<String> dados = LerArquivo.retornaString();

        try {
            Map<String, CorpoCeleste> dadosParseados = Util.retornaDados(dados);
            if (Util.existe(dadosParseados.values(), e)){
                System.out.println(dadosParseados.get(id));
            }else {
                System.out.println("A estrela com ID " + id + " Não existe");
            }
        } catch (FormatoIncorretoException erro) {
            System.out.println("Há um problema no seu arquivo texto. " + erro.getMessage());
        }
        
    }
}
