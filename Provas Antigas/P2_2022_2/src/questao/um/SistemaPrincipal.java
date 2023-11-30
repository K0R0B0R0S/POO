package questao.um;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class SistemaPrincipal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Academia a = new Academia("Academia A");

        System.out.println("Quantos ninjas serão cadastrados?");
        int qnt = sc.nextInt();

        for (int i = 0;i < qnt;i++){
            System.out.println("Deseja cadastrar: Genin (1), Chunin (2), Jonin (3)");
            int op = sc.nextInt();
            sc.nextLine();
            System.out.println("Insira o Nome:");
            String nome = sc.nextLine();
            System.out.println("Insira o CPF:");
            String cpf = sc.nextLine();
            System.out.println("Insira a idade:");
            int idade = sc.nextInt();
            switch (op){
                case 1:
                    a.matriculaNinja(new Genin(nome, cpf, idade));
                    break;
                case 2:
                    a.matriculaNinja(new Chunin(nome, cpf, idade));
                    break;
                case 3:
                    a.matriculaNinja(new Jonin(nome, cpf, idade));
                    break;
            }
        }
        sc.nextLine();

        System.out.println("Cadastro dos ninjas realizado com sucesso!");
        System.out.println("Informe um CPF para ser procurado na listagem");
        
        String cpf = sc.nextLine();
        while (!cpf.equals("0")) {
            Ninja n = new Ninja(cpf);
            a.imprimeDadosNinjaSeExistir(n);
            System.out.println("Informe um CPF para ser procurado na listagem");
            cpf = sc.nextLine();
        }

        List listagem = a.getListaNinjas();
        Collections.sort(listagem);
        for (int i = 0; i < listagem.size(); i++){
            System.out.println(((Ninja)listagem.get(i)).getNome());
        }

    }
}
