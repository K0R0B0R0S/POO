package questao.um;

public class LivroDeLivraria extends Livro{
    private boolean vendido;

    LivroDeLivraria(int ano, boolean vend){
        super(ano);
        this.vendido = vend;
    }

    public void setVendido(boolean vendido){
        this.vendido = vendido;
    }

    public boolean getVendido(){
        return this.vendido;
    }

}
