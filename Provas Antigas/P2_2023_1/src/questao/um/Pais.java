package questao.um;

import java.util.ArrayList;

public class Pais{
    private String codigo;
    private int populacao;
    private String nome;
    private double dimensao;
    private ArrayList<Pais> fronteira = new ArrayList<Pais>();

    public Pais(String codigo){
        setCodigo(codigo);
    }

    public Pais(String codigo, String nome, double dimensao){
        this(codigo);
        setNome(nome);
        setDimensao(dimensao);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo.toUpperCase();
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public ArrayList<Pais> getFronteira() {
        return fronteira;
    }

    public void addPaisFronteira(Pais p){
        this.fronteira.add(p);
    }

    public boolean equals(Object o){
        if (o instanceof Pais){
            Pais u = (Pais)o;
            return this.codigo.equals(u.getCodigo());
        }
        return false;
    }

    public double getDensidade(){
        return this.populacao / this.dimensao;
    }

    public boolean fazFronteira(Pais p){
        return this.fronteira.contains(p);
    }

    public String toString(){
        return this.nome;
    }

}