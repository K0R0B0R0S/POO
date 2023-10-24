package um;

public class Aluno{
    String nome;
    double nota1;
    double nota2;

    String getNome(){
        return this.nome;
    }

    double getNota1(){
        return this.nota1;
    }

    double getNota2(){
        return this.nota2;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setNota1(double nota1){
        this.nota1 = ajeitaNota(nota1);
    }

    void setNota2(double nota2){
        this.nota2 = ajeitaNota(nota2);
    }

    double ajeitaNota(double nota){
        if(nota < 0){
            nota = 0.0d;
        }else if(nota > 10){
            nota = 10.0d;
        }
        return nota;
    }

    double calculaMedia(){
        return (getNota1() + getNota2())/2;
    }

    String exibeSituacao(){
        double media = calculaMedia();
        if(media >= 4 && media <= 5.9){
            return "Em Recuperação";
        }else if(media < 4){
            return "Reprovado";
        }else if(media >= 6){
            return "Aprovado";
        }
        return "Aprovado";
    }
}