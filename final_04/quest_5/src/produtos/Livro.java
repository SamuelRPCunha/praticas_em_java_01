package produtos;

import calculos.Calculavel;

public class Livro implements Calculavel {
    private String nomeDoLivro;
    private int valorDoLivro;

    public Livro(String nomeDoLivro, int valorDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
        this.valorDoLivro = valorDoLivro;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public int getValorDoLivro() {
        return valorDoLivro;
    }

    @Override
    public double calcularPrecoFinal() {
        return valorDoLivro - (valorDoLivro * 0.1);
    }
}
