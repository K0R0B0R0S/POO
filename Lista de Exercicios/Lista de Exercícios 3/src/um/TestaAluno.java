package um;

public class TestaAluno {
    public static void main(String[] args){
        Aluno x1 = new Aluno();
        x1.setNome("José");
        x1.setNota1(-10);
        x1.setNota2(12);

        System.out.println(x1.calculaMedia());
        System.out.println(x1.exibeSituacao());
    }
}
