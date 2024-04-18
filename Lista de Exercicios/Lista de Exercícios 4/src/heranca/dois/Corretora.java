package heranca.dois;

public class Corretora {
    public static Imovel[] array = new Imovel[5];
    public static void main(String[] args){
        array[0] = new Velho();
        array[1] = new Novo();
        array[2] = new Velho();
        array[3] = new Novo();
        array[4] = new Velho();
        System.out.println(somaPreco(array));
    }

    public static double somaPreco(Imovel[] a){
        double soma = 0.0;
        for (Imovel x: a){
            soma += x.getPreco();
        }
        return soma;

    }
}
