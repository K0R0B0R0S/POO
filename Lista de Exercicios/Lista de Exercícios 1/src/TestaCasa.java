/*
Exercício 4 – Crie uma classe chamada TestaCasa com o método main
A)
crie dois objetos do tipo Casa.
B)
Atribua valores às variáveis de instância
C)
Imprima no console os valores cor e número de cada casa no seguinte formato: A casa de número X tem cor Y.
 */

public class TestaCasa {
    public static void main(String[] args) {
        Casa c1 = new Casa();
        Casa c2 = new Casa();

        c1.cor = "Preta";
        c1.numero = 20;

        c2.cor = "Branco";
        c2.numero = 30;

        System.out.println("A casa de número " + c1.numero + " tem cor " + c1.cor);
        System.out.println("A casa de número " + c2.numero + " tem cor " + c2.cor);

    }
}
