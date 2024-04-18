/*
Exercício 1 – Diga quais exemplos abaixo compilam:
a) public class Caixa {}
R: Compila
b) public Camisa class {} 
R: Não compila, class na posição errada
c) public Arvore {}
R: Não compila, falta a palavra class já que no referimos a uma classe com {}
d) public Class Terreno {}
R: Não compila, class com C maiúsculo 
*/

/*
Exercício 2 – Quais declarações de variáveis estão incorretas?
public class Elefante {
    private String nome;
    private int idade;
    public boolean morto;
    String cor;
    default double peso;
    public tamanho int;
}
 */

public class Exercicio_1_e_2 {
    public static void main(String[] args) throws Exception {
    }

    //Exercício 1
    public class Caixa {}
    //R: Compila

    public Camisa class {}
    //R: Não compila, class na posição errada

    public Arvore {}
    //R: Não compila, falta a palavra class já que no referimos a uma classe com {}

    public Class Terreno {}
    //R: Não compila, class com C maiúsculo 

    public class Elefante{
        private String nome;
        private int idade;
        public boolean morto;
        String cor;
        
        public tamanho int;
        //Incorreto.

        default double peso;
        //Incorreto.
    }

}
