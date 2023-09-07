/*
Exercício 6 – Observe o exemplo abaixo e diga o se há algo errado
R: tentativa de atribuir um valor double para em uma variavel inteiro
 */
public class Exercicio_6_Conta {
    double saldo;

    public void calcula () {
        if (saldo < 1000) {
            int teste = saldo - 1000;
            if (teste < 0) {
            System.out.println("Deu zebra");
            }
        }
    }
}