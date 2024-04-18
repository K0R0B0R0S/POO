package questao.tres;

import java.util.Objects;

public class Livro {
    private String id;

    public Livro(){

    }

    public Livro(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object o){
        if (o instanceof Livro){
            Livro u = (Livro)o;
            return this.id.equals(u.getId());
        }
        return false;
    }
    
    public String toString(){
        return "Livro id: " + this.id;
    }

    // Gerado pelo GPT: não estudado em Aula.
    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((id == null) ? 0 : id.hashCode());
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null || getClass() != obj.getClass())
    //         return false;
    //     Livro other = (Livro) obj;
    //     return Objects.equals(id, other.id);
    // }
    
}
