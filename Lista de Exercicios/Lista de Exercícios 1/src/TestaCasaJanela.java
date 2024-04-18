/*
Exercício 6 – Crie uma nova classe chamada TestaCasaJanela com o método
main.
A) Crie um novo objeto Janela e atribua valores a ele.
B) Crie um novo objeto Casa e atribua valores a ele, inclusive a Janela criada
acima (item A).
C) Faça o debug e entenda o que acontece.
R: Os o atributo janela de casa fica um uma referencia para a intancia de Janela (j1)
D) A partir da referencia da Casa, imprima os valores dos atributos da casa e
da janela.
 */

public class TestaCasaJanela {
    public static void main(String[] args){
        Janela j1 = new Janela();
        j1.cor = "Branca";
        j1.material = "Madeira";

        Casa c1 = new Casa();
        c1.cor = "Preta";
        c1.numero = 20;
        c1.janela = j1;

        System.out.println(c1.cor + " " + c1.numero + " " + c1.janela.cor + " " + c1.janela.material);

    }
}
