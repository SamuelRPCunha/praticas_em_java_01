package produtos;

import calculos.Calculavel;

public class ProdutoFisico implements Calculavel {
    private String nomeDoProduto;
    private int valorDoProduto;

    public ProdutoFisico(String nomeDoProduto, int valorDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.valorDoProduto = valorDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public int getValorDoProduto() {
        return valorDoProduto;
    }

    @Override
    public double calcularPrecoFinal() {
        return valorDoProduto + (valorDoProduto * 0.2);
    }
}
