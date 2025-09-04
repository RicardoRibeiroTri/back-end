import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente();
        Conta cp1 = new ContaPoupanca();
        Conta cpj1 = new ContaPessoaJuridica();

        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cp1);
        contas.add(cpj1);

        while (true) {
            System.out.println("Bem-vindo ao banco!" +
                    "\nEscolha uma conta:" +
                    "\n1. Conta Corrente" +
                    "\n2. Conta Poupança" +
                    "\n3. Conta Pessoa Jurídica ");

            int escolhaConta = 0;
            switch (escolhaConta) {

                case 1:


            }


            while (true) {
                System.out.println("O que deseja fazer? " +
                        "\n1. Depositar" +
                        "\n2. Sacar" +
                        "\n3. Ver saldo" +
                        "\n4. Avançar um mês" +
                        "\n5. Sair da conta");
            }
        }

        }
    }
