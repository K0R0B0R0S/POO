package questao.um;

public abstract class Livro {
    private String nome;
    private String autor;
    private int ano;
    private String ISBN;

    public Livro(int ano) {
        setAno(ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }

    public boolean equals(Object o) {
        if (o instanceof Livro) {
            Livro u = (Livro) o;
            return this.ISBN.equals(u.getISBN());
        }
        return false;
    }
}
