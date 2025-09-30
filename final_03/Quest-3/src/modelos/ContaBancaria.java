package modelos;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valorParaDepositar) {
        saldo += valorParaDepositar;
    }

    public void sacar(double valorParaSacar) {
        if (valorParaSacar <= saldo) {
            saldo -= valorParaSacar;
            System.out.println("Saque de R$" + valorParaSacar + " realizado com sucesso, saldo atual: R$" + saldo);
        }
        else  {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
}
