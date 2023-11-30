package questao.um;

public class Chunin extends Ninja {
    public Chunin(String cpf) {
        super(cpf);
    }

    public Chunin(String nome, String cpf, int idade){
        super(nome, cpf, idade);
    }

    public void treinar() {
        System.out.println("Chunin " + this.getNome() + " iniciando treinamento simples");
    }
}
