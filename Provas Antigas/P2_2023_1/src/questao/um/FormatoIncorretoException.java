package questao.um;

public class FormatoIncorretoException extends Exception {
    FormatoIncorretoException(int qnt, String str){
        super("A string " + str + " possui " + qnt +" #");
    }
}
