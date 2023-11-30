package questao.um;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Util {
    public Map retornaMapa(List listaNinjas){
        Map mapa = new HashMap();
        for(int i=0; i < listaNinjas.size(); i++){
            Ninja n = (Ninja)listaNinjas.get(i);
            mapa.put(n.getCpf(), n);
        }
        return mapa;
    }
}
