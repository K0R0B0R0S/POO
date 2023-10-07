package questao.um;

public class Biscoito{
    private String id;
    private String cor;
    private int preco;

    public Biscoito(String id){
        setId(id);
    }

    public String getId(){
        return id;
    }

    public String getCor(){
        return cor;
    }

    public int getPreco(){
        return preco;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public boolean equals(Object o){
        if (o instanceof Biscoito){
            Biscoito u = (Biscoito)o;
            return this.getId().equals(u.getId());
        }
        return false;
    }
}