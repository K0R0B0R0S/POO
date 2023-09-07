/*
Exercício 2 – Crie uma classe chamada GatoTeste com o método main
A)
crie 3 instâncias de Gato. Atribua a cada uma das instâncias valores para as
variáveis vivo, cor, idade, nome de forma que cada instância tenha valores
diferentes.
B)
imprima o valor dos atributos de cada Gato no console. O valor dos
atributos de cada Gato deve estar em uma linha, ou seja, um System.out para
cada objeto.
 */


public class GatoTeste{
    public static void main(String[] args){
        Gato g1 = new Gato();
        Gato g2 = new Gato();
        Gato g3 = new Gato();
        g1.nome = "Gato 1";
        g1.cor = "Preto";
        g1.idade = 3;
        g1.vivo = true;

        g2.nome = "Gato 2";
        g2.cor = "Branco";
        g2.idade = 4;
        g2.vivo = true;

        g3.nome = "Gato 3";
        g3.cor = "Azul";
        g3.idade = 5;
        g3.vivo = false;

        System.out.println("Nome:"+ g1.nome + " Cor:" + g1.cor + " Idade:" + g1.idade + " Vivo:" + g1.vivo);
        System.out.println("Nome:"+ g2.nome + " Cor:" + g2.cor + " Idade:" + g2.idade + " Vivo:" + g2.vivo);
        System.out.println("Nome:"+ g3.nome + " Cor:" + g3.cor + " Idade:" + g3.idade + " Vivo:" + g3.vivo);

    }
}
