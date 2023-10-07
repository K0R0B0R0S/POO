package questao.um;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaBiscoito{
    //Testa se Biscoito existe em um ArrayList comparando os ids.
    public static void main(String[] args){
        ArrayList x = Utils2.getLista();

        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();

        Biscoito a = new Biscoito(id);
        boolean resultado = Utils.existe(x, a);
        System.out.println(resultado);
        System.out.println(transformaListEmArray(x));

        System.out.println(calculaTotal(transformaListEmArray(x)));


        scan.close();
    }

    public static ArrayList transformaListEmArray(List k){
        ArrayList returnArray = new ArrayList();
        for (Object object : k) {
            if (object instanceof Biscoito) {
                returnArray.add(object);
            }
        }
        return returnArray;
    }

    public static int calculaTotal(ArrayList k){
        int total = 0;
        for(Object object: k){
            Biscoito u = (Biscoito)object;
            total += u.getPreco();
        }
        return total;
    }

}