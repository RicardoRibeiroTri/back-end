abstract class Conta {

    protected int numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        saldo = deposito + saldo;
    }

    public void sacar(double saque) {
        saldo = saldo - saque;
    }

    public void exibirSaldo() {
        System.out.println(saldo);
    }

    abstract void calcularTarifaMensal(double tarifa);



}
