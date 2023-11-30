package questao.quatro;

public class NumeroNegativoException extends Exception {
    NumeroNegativoException(String e){
        super("O número " + e + " é negativo, insira apenas números positivos");
    }
}
