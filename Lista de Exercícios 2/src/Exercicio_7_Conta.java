/*
Exercício 7 – Observe o exemplo abaixo e diga o se há algo errado:
R: ´saldo´ não pode ser validado como um boolean
 */
public class Exercicio_7_Conta {
    double saldo;
    public void calcula () {
        if (saldo) {
            System.out.println("Tem saldo");
        } else {
            System.out.println("Não tem saldo");
        }
    }
}
