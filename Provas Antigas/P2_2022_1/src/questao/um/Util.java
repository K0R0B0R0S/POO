package questao.um;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Util {
    public static boolean existe(Collection<CorpoCeleste> x, CorpoCeleste y){
        return x.contains(y);
    }

    public static void ordena(List<CorpoCeleste> x){
        Collections.sort(x);
    }

    public static Map<String, CorpoCeleste> retornaDados(Set<String> conjuntoCorpos) throws FormatoIncorretoException{
        Map<String, CorpoCeleste> map = new HashMap<String, CorpoCeleste>();
        Iterator<String> it = conjuntoCorpos.iterator();
        while (it.hasNext()){
            String dado = (String)it.next();
            String[] splitedDado = dado.split("#");
            
            if (splitedDado.length != 4){
                throw new FormatoIncorretoException(dado);
            }

            if ("P".equals(splitedDado[3])){

                Planeta u = new Planeta(splitedDado[0]);
                u.setDistancia(Double.parseDouble(splitedDado[2]));
                u.setNome(splitedDado[1]);

                map.put(splitedDado[0], u);
            } else if ("E".equals(splitedDado[3])){

                Estrela u = new Estrela(splitedDado[0]);
                u.setDistancia(Double.parseDouble(splitedDado[2]));
                u.setNome(splitedDado[1]);

                map.put(splitedDado[0], u);
            }
        }
        return map;
    }

}
