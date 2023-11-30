package questao.um;

public class testa {
    public static void main(String[] args) {
        Livro x = new LivroDeBiblioteca(0, false);
        Instituicao a = new Instituicao();
        a.inserirLivro(x);
        System.out.println(a.getListaDeLivros());
    }
}
