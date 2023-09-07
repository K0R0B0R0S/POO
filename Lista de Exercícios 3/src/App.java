public class App {
    public static void main(String[] args) throws Exception {
        Data d = new Data();
        ContaBancaria c1 = new ContaBancaria();

        d.setAno(2023);
        d.setMes(5);
        d.setDia(12);

        c1.setDataAbertura(d);
        System.out.println(c1.getDataAberturaFormatada());
        System.out.println(c1.getSaldoFormatado());
        c1.depositar(10);
        System.out.println(c1.getSaldoFormatado());
        c1.sacar(10);
        System.out.println(c1.getSaldoFormatado());

    }
}
