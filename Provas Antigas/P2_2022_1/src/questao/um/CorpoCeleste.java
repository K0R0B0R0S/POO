package questao.um;

import java.lang.Comparable;

public class CorpoCeleste implements Comparable<CorpoCeleste>{
    private String id;
    private String nome;
    private double distancia;

    CorpoCeleste(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public boolean equals(Object o){
        if (o instanceof CorpoCeleste){
            CorpoCeleste u = (CorpoCeleste)o;
            return this.id.equals(u.getId());
        }
        return false;
    }

    public int compareTo(CorpoCeleste o){
        if (this.distancia < o.getDistancia()){
            return -1;
        } else if (this.distancia > o.getDistancia()){
            return 1;
        }
        return 0;
    }

    public String toString(){
        return this.id + " : " + this.nome + " : " + this.distancia;
    }
}
