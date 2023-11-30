package questao.um;

public class Ninja implements Treinamento, Comparable{
    private String nome;
    private String cpf;
    private int idade;
    
    public Ninja(String cpf){
        this.cpf = cpf;
    }

    public Ninja(String nome, String cpf, int idade){
        this(cpf);
        this.nome = nome;
        this.idade = idade;
    }


    public void treinar(){
        System.out.println("Ninja treinando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean equals(Object o){
        if (o instanceof Ninja){
            Ninja u = (Ninja)o;
            return this.getCpf().equals(u.getCpf());
        }
        return false;
    }

    public String toString(){
        return "Nome: " + this.nome + " CPF: " + this.cpf + " Idade: " + this.idade;
    }

    public int compareTo(Object o){
        Ninja u = (Ninja)o;
        return Integer.compare(this.idade, u.getIdade());
    }

}
