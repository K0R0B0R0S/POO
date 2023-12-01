package questao.tres;

public class Livro {
    private String id;

    public Livro(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object o){
        if (o instanceof Livro){
            Livro u = (Livro)o;
            return this.id.equals(u.getId());
        }
        return false;
    }
    
    public String toString(){
        return "Livro id: " + this.id;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode() + Integer.parseInt(this.id);
    }
    
}
