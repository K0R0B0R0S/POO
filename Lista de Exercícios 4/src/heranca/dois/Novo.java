package heranca.dois;

public class Novo extends Imovel{
    public double getPreco(){
        return super.getPreco() * 1.10;
    }
}