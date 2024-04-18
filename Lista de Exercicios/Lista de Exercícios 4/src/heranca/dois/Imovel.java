package heranca.dois;

public class Imovel{
    private String endereco;
    private double preco = 100;

    public String getEndereco(){
        return this.endereco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}