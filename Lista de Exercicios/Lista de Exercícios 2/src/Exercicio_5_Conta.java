/*
Exercício 5 – Observe o exemplo abaixo e diga o se há algo errado:
R: ´testeSaldo´ existe apenas no escopo do IF
 */

public class Exercicio_5_Conta {
    double saldo;

    public void calcula() {
        if (saldo < 1000) {
            double testeSaldo = saldo * 0.1;
        }
        System.out.println(testeSaldo);
    }
}
