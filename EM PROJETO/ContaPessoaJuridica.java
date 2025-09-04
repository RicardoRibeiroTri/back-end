public class ContaPessoaJuridica extends Conta {

    public ContaPessoaJuridica() {
    }

    @Override
    void calcularTarifaMensal(double tarifa) {
        tarifa = 20;
        if (saldo == 0) {
            System.err.println("Saldo insuficiente");
        } else {
            for (Meses i : Meses.values()) {
                saldo = saldo - tarifa;
            }
        }
    }
}
