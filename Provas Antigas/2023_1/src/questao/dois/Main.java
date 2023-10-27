package questao.dois;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("As entradas devem seguir o segunte padrão: nome#peso#altura");

        List strings = new ArrayList();
        while (strings.size() < 1000) {
            String entrada = sc.nextLine();
            if(entrada.equals("finalizar")){
                break;
            }
            strings.add(entrada);
        }
        System.out.println(strings);

        double soma = 0;
        for (Object str: strings){
            if(str instanceof String){
                String u = (String)str;
                String[] splitedString = u.split("#");
                soma += Double.parseDouble(splitedString[1]);

            }
        }
        System.out.println(soma / strings.size());
    
    }
}
