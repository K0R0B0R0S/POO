/*
Exercício 3 – Imprima a soma de todos os números ímpares de 1 a 10.000.
 */

public class Exercicio_3 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10000 ; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}