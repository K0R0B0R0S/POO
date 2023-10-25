package heranca.UFC;

public class TestaLutador {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[10];
        //Adicionar lutdores vindo do Scanner.
        lutadores[0] = new PesoMedio("Anderson Silva", 45, 84.0);
        lutadores[1] = new PesoPena("Khabib", 31, 70.0);
        lutadores[2] = new MeioPesado("Jon Jones", 32, 93.0);
        lutadores[3] = new MeioPesado("Thiago Santos", 36, 93.0);
        lutadores[4] = new PesoPesado("Stipe Miocic", 37, 113.5);
        lutadores[5] = new PesoPena("Max Holloway", 28, 66.0);
        lutadores[6] = new PesoMedio("Yoel Romero", 42, 84.5);
        lutadores[7] = new PesoPesado("Stipe Miocic", 37, 113.5);
        lutadores[8] = new MeioPesado("Jon Jones", 32, 93.0);
        lutadores[9] = new PesoMedio("Anderson Silva", 45, 84.0);

        //Adicionar numero vindo do Scanner.
        int numero = 1;
        System.out.println(lutadores[numero]);
        lutadores[numero].possiveisLutas(lutadores);
        lutadores[numero].sorteiaLuta(lutadores);

    }
}
