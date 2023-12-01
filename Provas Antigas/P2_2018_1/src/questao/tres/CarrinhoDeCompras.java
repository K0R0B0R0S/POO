package questao.tres;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Livro> lista = new ArrayList<Livro>();

    public List<Livro> getLista() {
        return lista;
    }

    public void insereItem(Livro l) {
        this.lista.add(l);
    }


}
