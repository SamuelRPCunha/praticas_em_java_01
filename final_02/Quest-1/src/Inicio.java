public class Inicio {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setSaldo(500);
        conta.setNumeroConta(120);
        conta.titular = ("Niltom");

        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Numero conta: " + conta.getNumeroConta());
        System.out.println("Titular da conta: " + conta.titular);
    }
}
