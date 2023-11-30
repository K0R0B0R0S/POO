package questao.um;

import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        LivroDeBiblioteca lb1 = new LivroDeBiblioteca(2012, false);
        lb1.setNome("Livro 1");
        lb1.setAutor("Autor 1");
        lb1.setISBN("111");

        LivroDeBiblioteca lb2 = new LivroDeBiblioteca(2014, true);
        lb2.setNome("Livro 2");
        lb2.setAutor("Autor 2");
        lb2.setISBN("222");

        LivroDeLivraria lv1 = new LivroDeLivraria(2011, true);
        lv1.setNome("Livro 3");
        lv1.setAutor("Autor 3");
        lv1.setISBN("333");

        LivroDeLivraria lv2 = new LivroDeLivraria(2012, false);
        lv2.setNome("Livro 4");
        lv2.setAutor("Autor 4");
        lv2.setISBN("444");

        Instituicao i = new Instituicao();
        i.inserirLivro(lb1);
        i.inserirLivro(lb2);
        i.inserirLivro(lv1);
        i.inserirLivro(lv2);

        imprimeRelatorioGeral(i.getListaDeLivros());

        System.out.println("Qual o ISBN do livro a ser consultado?");
        Scanner sc = new Scanner(System.in);
        String ISBN = sc.nextLine();
        sc.close();

        Livro l = new LivroDeBiblioteca(0, false);
        l.setISBN(ISBN);

        List livros = i.getListaDeLivros();
        if (livros.contains(l)){
            int index = livros.indexOf(l);
            Livro u = (Livro)livros.get(index);
            //Eu usaria `toString` mas não sei as limitações da questão 😕
            System.out.println("Nome: "+ u.getNome() + " Ano: " + u.getAno() + " Autor: " + u.getAutor());
        }else {
            System.out.println("Livro não existe");
        }
        

    }

    public static void imprimeRelatorioGeral(List<Livro> lista){
        Iterator<Livro> it = lista.iterator();

        while(it.hasNext()){
            Livro l = it.next();
            if (l instanceof LivroDeBiblioteca){
                LivroDeBiblioteca u = (LivroDeBiblioteca)l;
                //Eu usaria `toString` mas não sei as limitações da questão 😕
                System.out.println("Nome: "+ u.getNome() + " Ano: " + u.getAno() + " Alugado: " + (u.getAlugado() ? "sim" : "não"));
            }else if (l instanceof LivroDeLivraria){
                LivroDeLivraria u = (LivroDeLivraria)l;
                //Eu usaria `toString` mas não sei as limitações da questão 😕
                System.out.println("Nome: "+ u.getNome() + " Ano: " + u.getAno() + " Alugado: " + (u.getVendido() ? "sim" : "não"));
            }
        }

    }
}
