package questao.dois;

import java.util.Scanner;
import java.util.List;

public class Testa {
    public static void main(String[] args) {
        List stringArrayList = BancoDeDados.getFunc();
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int somaIdade = 0;
        int count = 0;
        for (Object str : stringArrayList) {
            if (str instanceof String){
                String u = (String)str;
                String[] splitedString = u.split("#");
                if(nome.equals(splitedString[0])){
                    System.out.println(splitedString[0] + " - idade: " + splitedString[1]);
                }
                somaIdade += Integer.parseInt(splitedString[1]);
                count += 1;
            }
        }
        System.out.println(somaIdade);
        System.out.println(count);
        System.out.println((double)somaIdade / (double)count);

    }
    
}
