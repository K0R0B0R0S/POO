package questao.quatro;

//Console:
// null -Console
// Eucalipto -Console
// Abacateiro -Console
// 10 -Console
// Macieira -Console
// 10 -Console
// 5 -Console
// 99 -Console
// 5 -Console
// 99 -Console
// Abacateiro -Console
// 5 -Console

public class TesteArvore {
    public static void main(String[] args) {
        Arvore v1 = new Arvore(); // v1: Arvore@1 (@1.nome = null | @1.a = 0 | Arvore.b = 0)
        System.out.println(v1.getNome()); // null -Console
        v1.setNome("Acacia"); // v1: Arvore@1 (@1.nome = Acacia | @1.a = 0 | Arvore.b = 0)
        Arvore v2 = new Arvore(); // v2: Arvore@2 (@2.nome = null | @2.a = 0 | Arvore.b = 0)
        v2.setNome("Ipe"); // v2: Arvore@2 (@2.nome = Ipe | @2.a = 0 | Arvore.b = 0)
        teste1(v1, v2);
        // v2: Arvore@2 (@2.nome = Abacateiro | @2.a = 0 | Arvore.b = 0)
        // v1: Arvore@1 (@1.nome = Eucalipto | @1.a = 0 | Arvore.b = 0)
        System.out.println(v1.getNome()); // Eucalipto -Console
        System.out.println(v2.getNome()); // Abacateiro -Console
        v1.a = 10; // v1: Arvore@1 (@1.nome = Eucalipto | @1.a = 10 | Arvore.b = 0)
        int x = v1.a; // x: 10
        v1.a = 5; // v1: Arvore@1 (@1.nome = Eucalipto | @1.a = 5 | Arvore.b = 0)
        v2.a = v1.a; // v2: Arvore@2 (@2.nome = Abacateiro | @2.a = 5 | Arvore.b = 0)
        System.out.println(x); // 10 -Console
        teste2(v1.a, x, v1);
        // v1: Arvore@1 (@1.nome = Macieira | @1.a = 5 | Arvore.b = 99)
        // v2: Arvore@2 (@2.nome = Abacateiro | @2.a = 5 | Arvore.b = 99)
        System.out.println(v1.getNome()); // Macieira -Console
        System.out.println(x); // 10 -Console
        System.out.println(v1.a); // 5 -Console
        System.out.println(v1.b); // 99 -Console
        System.out.println(v2.a); // 5 -Console
        System.out.println(v2.b); // 99 -Console
        teste3(v2);
        // v2: Arvore@2 (@2.nome = Abacateiro | @2.a = 5 | Arvore.b = 99)
        System.out.println(v2.getNome()); // Abacateiro -Console
        System.out.println(v2.a); // 5 -Console
    }

    public static void teste1(Arvore v2, Arvore v1) { 
        // v2: Arvore@1 (@1.nome = Acacia | @1.a = 0 | Arvore.b = 0)
        // v1: Arvore@2 (@2.nome = Ipe | @2.a = 0 | Arvore.b = 0)
        v1.setNome("Abacateiro"); // Arvore@2 (@2.nome = Abacateiro | @2.a = 0 | Arvore.b = 0)
        v1 = v2; // v1: Arvore@1 (@1.nome = Acacia | @1.a = 0 | Arvore.b = 0)
        v1.setNome("Eucalipto"); // Arvore@1 (@1.nome = Eucalipto | @1.a = 0 | Arvore.b = 0)
    }

    public static void teste2(int a, int x, Arvore arv) {
        // a: 5
        // x: 10
        // arv: v1: Arvore@1 (@1.nome = Eucalipto | @1.a = 5 | Arvore.b = 0)
        a = 20; // a: 20
        x = 15; // x: 15
        arv.b = 99; // arv: v1: Arvore@1 (@1.nome = Eucalipto | @1.a = 5 | Arvore.b = 99)
        arv.setNome("Macieira"); // arv: v1: Arvore@1 (@1.nome = Macieira | @1.a = 5 | Arvore.b = 99)
        arv = new Arvore(); // arv: Arvore@3 (@3.nome = null | @3.a = 0 | Arvore.b = 99)
    }

    public static Arvore teste3(Arvore v2) {
        // v2: Arvore@2 (@2.nome = Abacateiro | @2.a = 5 | Arvore.b = 99)
        v2 = new Arvore(); // v2: Arvore@4 (@4.nome = null | @4.a = 0 | Arvore.b = 99)
        v2.setNome("Mogno"); // v2: Arvore@4 (@4.nome = Mogno | @4.a = 0 | Arvore.b = 99)
        return v2;
    }
}