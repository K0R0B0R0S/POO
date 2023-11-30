package questao.um;

import java.util.ArrayList;

public class Instituicao {
    private String nome;
    private ArrayList listaDeLivros =  new ArrayList();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inserirLivro(Livro l){
        // if (listaDeLivros === null){
        //     this.listaDeLivros = new ArrayList();
        // }
        // Talvez fazer assim? e remover `= new ArrayList()` do atributo `listaDeLivros`
        this.listaDeLivros.add(l);
    }

    public ArrayList getListaDeLivros(){
        return listaDeLivros;
    }
    
}
