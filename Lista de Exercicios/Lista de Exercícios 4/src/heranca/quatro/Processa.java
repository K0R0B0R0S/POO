package heranca.quatro;
//Não compila, pois o método calcula não possui o modificador static
//para usarmos esse método devemos primeiramente instanciar um objeto
//da classe Processa.
public class Processa {
    public static void main(String[] agrs) {
        System.out.print(calcula(2, 3));
    }

    public static double calcula(double a, double b) {
        return (a + b) * (a * 0.1) + (b * 0.9);
    }
}