package questao.um;

import java.util.List;
import java.util.ArrayList;

public class Academia {
    private String nome;
    private List listaNinjas = new ArrayList();
    
    public Academia(String nome){
        this.nome = nome;
    }

    public List getListaNinjas() {
        return listaNinjas;
    }

    public void matriculaNinja(Ninja n){
        System.out.println("Academia matriculando Ninja");
        listaNinjas.add(n);
    }

    public boolean imprimeDadosNinjaSeExistir(Ninja n){
        boolean existe = this.listaNinjas.contains(n);
        if(existe){
            int index = listaNinjas.indexOf(n);
            Ninja ninja = (Ninja)listaNinjas.get(index);
            System.out.println(ninja);
        }
        else {
            System.out.println("Ninja não existe");
        }
        return existe;
    }

    public String toString(){
        return this.nome + " " + listaNinjas.size();
    }
}
