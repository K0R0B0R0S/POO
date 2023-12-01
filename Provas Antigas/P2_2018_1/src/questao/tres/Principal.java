package questao.tres;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CarrinhoDeCompras car = new CarrinhoDeCompras();
        for (int i=0; i < 3; i++){
            String id = sc.nextLine();
            Livro l = new Livro(id);
            car.insereItem(l);
        }

        System.out.println(car.getLista());
        Util.quantidade(car);

    }
}
