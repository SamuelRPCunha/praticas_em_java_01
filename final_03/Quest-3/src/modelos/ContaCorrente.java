package modelos;

public class ContaCorrente extends ContaBancaria{
    private double valorMensal;

    public void cobrarTarifaMensal() {
        saldo -= valorMensal;
        System.out.println("Tarifa mensal de R$" + valorMensal + " cobrada, saldo atual: R$" + saldo);
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
}
