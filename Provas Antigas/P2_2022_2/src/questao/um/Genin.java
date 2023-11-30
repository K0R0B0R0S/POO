package questao.um;

public class Genin extends Ninja{

    public Genin(String cpf){
        super(cpf);
    }

    public Genin(String nome, String cpf, int idade){
        super(nome, cpf, idade);
    }

    public void treinar(){
        System.out.println("Genin " + this.getNome() + " iniciando treinamento simples");
    }
}
