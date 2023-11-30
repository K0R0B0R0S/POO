package questao.um;

public class Jonin extends Ninja {
    public Jonin(String cpf) {
        super(cpf);
    }

    public Jonin(String nome, String cpf, int idade){
        super(nome, cpf, idade);
    }

    public void treinar() {
        System.out.println("Jonin " + this.getNome() + " iniciando treinamento simples");
    }
}
