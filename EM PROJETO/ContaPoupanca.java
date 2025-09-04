import javax.swing.plaf.IconUIResource;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    @Override
    void calcularTarifaMensal(double tarifa) {
        tarifa = 0;
        if (saldo == 0) {
            System.err.println("Saldo insuficiente");
        } else {
            for (Meses i : Meses.values()) {
                saldo = saldo - tarifa;
            }
        }
    }
}
