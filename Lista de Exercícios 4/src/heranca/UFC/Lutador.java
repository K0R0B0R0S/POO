package heranca.UFC;

import java.util.ArrayList;


public abstract class Lutador {
    private String nome;
    private int idade;
    private double peso;

    public Lutador(String nome, int idade, double peso){
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String toString(){
        return getNome() + "/" + getIdade() + "/" + getPeso();
    }

    public void possiveisLutas(Lutador[] a){
        for(Lutador l: a){
            if(this.getClass() == l.getClass()){
                System.out.println(l);
            }
        }
    }

    public String exibeCategoria(){
        double peso = getPeso();
        if(peso <= 65.0){
            return "Peso pesado";
        }else if(peso <= 83.9){
            return "Peso meio-pesado";
        }else if(peso <= 93.0){
            return "Peso médio";
        }else if(peso <= 120.2){
            return "Peso pena";
        }else{
            return "Desconhecido";
        }
    }

    public Lutador sorteiaLuta(Lutador[] l){
        ArrayList<Lutador> lutadores = new ArrayList<Lutador>();
        for (Lutador lutador: l){
            if(this.exibeCategoria() == lutador.exibeCategoria()){
                lutadores.add(lutador);
            }
        }
        int valor_aleatorio = (int)(Math.random() * lutadores.size());
        return (Lutador)lutadores.get(valor_aleatorio);
        
    }
}
