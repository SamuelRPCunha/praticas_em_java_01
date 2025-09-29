import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(double percentualDesconto) {
        double desconto = (preco * (percentualDesconto / 100));
        preco -=  desconto;
    }
}
