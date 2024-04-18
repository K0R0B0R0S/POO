public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        if(ano <= 0){
            throw new IllegalArgumentException("Número não pode ser negativo ou zero"); 
        }
        this.ano = ano;
    }

    public void setDia(int dia) {
        if(dia <= 0){
            throw new IllegalArgumentException("Número não pode ser negativo ou zero");
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        if(mes <= 0){
            throw new IllegalArgumentException("Número não pode ser negativo ou zero");
        }
        this.mes = mes;
    }
}
