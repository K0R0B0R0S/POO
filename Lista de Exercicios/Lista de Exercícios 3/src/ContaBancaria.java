public class ContaBancaria {
    private double saldo = 0.0;
    private Data dataAbertura;

    public Data getDataAbertura(){
        return dataAbertura;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setDataAbertura(Data d){
        this.dataAbertura = d;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAberturaFormatada(){
        return this.dataAbertura.getDia() + "/" + this.dataAbertura.getMes() + "/" + this.dataAbertura.getAno(); 
    }

    public String getSaldoFormatado(){
        return "R$ " + this.saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Retirar esse valor fará com que a conta fique nagativada, não é permitido.");
        }
        this.saldo -= valor;
    }
    
}
