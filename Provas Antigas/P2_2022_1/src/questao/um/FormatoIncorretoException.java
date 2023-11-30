package questao.um;

public class FormatoIncorretoException extends Exception {
    FormatoIncorretoException(String e){
        super("O formato da String [" + e + "] está incorreto");
    }
}
