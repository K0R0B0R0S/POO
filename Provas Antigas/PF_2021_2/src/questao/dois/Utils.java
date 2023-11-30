package questao.dois;

import java.util.Set;
import java.util.Iterator;

public class Utils {
    public static void verifica(String texto) throws TextoCurtoException{
        if (texto.length() < 10){
            throw new TextoCurtoException("Texto inserido com " + texto.length() + " caracteres");
        }
    }

    public static String moderar(String texto){
        Set<String> listaPalavroes = Utilidades.getPalavroes();
        Iterator it = listaPalavroes.iterator();
        String aux = texto.toLowerCase();
        while (it.hasNext()) {
            String palavrao = ((String)it.next()).toLowerCase();
            if(aux.contains(palavrao)){
                int strComeco = aux.indexOf(palavrao);
                int strFinal = strComeco + palavrao.length();
                texto = texto.substring(0, strComeco) + "#".repeat(palavrao.length()) + texto.substring(strFinal, aux.length());
            }
        }
        return texto;
    }
}
