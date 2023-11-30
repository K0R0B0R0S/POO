package questao.um;

public class Negresco extends Biscoito implements Comestivel{

    public Negresco(String id){
        super(id);
    }

    public void comer(){
        System.out.println("Negresco " + getId() + ": Sendo comido");
    }
}
