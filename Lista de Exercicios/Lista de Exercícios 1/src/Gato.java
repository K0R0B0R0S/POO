/*
Exercício 1 – Crie uma classe chamada Gato
A)
crie 4 atributos:
vivo: boolean //identifica se o animal está vivo
cor: String
idade: int
nome: String
B)
crie um método chamado miar() que imprima no console: “Gato miando“
*/

public class Gato{
    boolean vivo;
    String cor;
    int idade;
    String nome;

    public void miar(){
        System.out.println(nome + " miando");
    }
}