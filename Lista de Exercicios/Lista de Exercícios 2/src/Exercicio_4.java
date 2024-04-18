/*
Exercício 4 – Imprima a soma de todos os números de 1 a 50.000 menos os
números entre 100 e 137.
 */
public class Exercicio_4 {
    public static void main(String[] args){
        for (int i = 0; i <= 50000; i++) {
            if(i != 100 && i != 137){
                System.out.println(i);
            }
        }
    }
}
