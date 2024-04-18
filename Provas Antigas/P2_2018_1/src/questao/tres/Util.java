package questao.tres;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import java.util.HashMap;
import java.util.Map;

public class Util {
    // Contagem com Map: sem utilizar Collections
    // public static void quantidade(CarrinhoDeCompras car){
    //     Map<String, Integer> mapa = new HashMap<String, Integer>();
    //     List<Livro> listagem = car.getLista();
    //     for (Livro l: listagem){
    //         String key = l.getId();
    //         if (mapa.containsKey(key)){
    //             Integer valor = mapa.get(key);
    //             mapa.put(key, valor+1);
    //         }else{
    //             mapa.put(key, 1);
    //         }
    //     }
    //     System.out.println(mapa);
    // }

    // Contagem com Set
    public static void quantidade(CarrinhoDeCompras car){
        List<Livro> listagemLivro = car.getLista();
        Set<String> listagemUnica = new HashSet<String>();
        for (Livro l : listagemLivro){
            listagemUnica.add(l.getId());
        }

        Iterator<String> it = listagemUnica.iterator();
        while(it.hasNext()){
            Livro l = new Livro(it.next());
            System.out.println(l + "-" + Collections.frequency(listagemLivro, l));
        }
    }

    // Para utilizar esse metodo deve-se descomentar HashCode e Equals de Livro
    // public static void quantidade(CarrinhoDeCompras car){
    //     Map<Livro, Integer> mapa = new HashMap<Livro, Integer>();
    //     List<Livro> lista = car.getLista();

    //     for (Livro l: lista){
    //         mapa.put(l, Collections.frequency(lista, l));
    //     }

    //     System.out.println(mapa);
    // }
}
