package questao.um;

public class LivroDeBiblioteca extends Livro{
    private boolean alugado;

    LivroDeBiblioteca(int ano, boolean alug){
        super(ano);
        this.alugado = alug;
    }

    public boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
}
