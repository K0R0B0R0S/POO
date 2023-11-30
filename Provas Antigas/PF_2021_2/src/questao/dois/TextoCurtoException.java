package questao.dois;

public class TextoCurtoException extends Exception{
    TextoCurtoException(String e){
        super("Texto inserido com " + e + " caracteres");
    }
}