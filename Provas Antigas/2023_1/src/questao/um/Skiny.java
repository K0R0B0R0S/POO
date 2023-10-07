package questao.um;

public class Skiny extends Biscoito implements Comestivel{

    public Skiny(String id){
        super(id);
    }

    public void comer(){
        System.out.println("Negresco " + getId() + ": Sendo comido");
    }
}
