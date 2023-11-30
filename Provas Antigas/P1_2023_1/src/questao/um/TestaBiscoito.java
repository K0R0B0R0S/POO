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
        if(resultado){
            System.out.println(x.get(x.indexOf(a)));
        }else{
            System.out.println("Biscoito não existe");
        }

        Biscoito[] arrayBiscoito = transformaListEmArray(x);
        System.out.println(calculaTotal(arrayBiscoito));


        scan.close();
    }

    public static Biscoito[] transformaListEmArray(List k){
        ArrayList biscoitos = new ArrayList();
        for (Object object : k) {
            if (object instanceof Biscoito) {
                biscoitos.add(object);
            }
        }
        Biscoito[] returnArray = new Biscoito[biscoitos.size()];
        for(int i=0;i<biscoitos.size();i++){
            returnArray[i] = (Biscoito)biscoitos.get(i);
        }
        return returnArray;
    }

    public static int calculaTotal(Biscoito[] k){
        int total = 0;
        for(Object object: k){
            Biscoito u = (Biscoito)object;
            total += u.getPreco();
        }
        return total;
    }

}