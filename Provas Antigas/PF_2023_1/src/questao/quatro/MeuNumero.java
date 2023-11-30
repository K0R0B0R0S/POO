package questao.quatro;

public class MeuNumero {
    public static double media(String str) throws NumeroNegativoException{
        String [] numeros = str.split("#");
        double soma = 0;
        for (String numero: numeros){
            double n = Double.parseDouble(numero);
            if (n < 0){
                throw new NumeroNegativoException(numero);
            }
            soma += n;
        }
        return soma / numeros.length;

    }
}
