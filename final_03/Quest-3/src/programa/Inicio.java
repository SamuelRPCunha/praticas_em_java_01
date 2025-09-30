package programa;

import modelos.ContaBancaria;
import modelos.ContaCorrente;

public class Inicio {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaCorrente();

        conta.depositar(2000);
        conta.consultarSaldo();

        ContaCorrente conta2 = new ContaCorrente();

        conta2.setValorMensal(230);
        conta2.depositar(4000);
        conta2.sacar(2000);
        conta2.consultarSaldo();
        conta2.cobrarTarifaMensal();
    }
}
