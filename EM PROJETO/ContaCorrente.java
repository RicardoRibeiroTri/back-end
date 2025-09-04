public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    @Override
    void calcularTarifaMensal(double tarifa) {
        tarifa = 12;
        if (saldo == 0) {
            System.err.println("Saldo insuficiente");
        } else {
            for (Meses i : Meses.values()) {
                saldo = saldo - tarifa;
            }
        }

    }
}
