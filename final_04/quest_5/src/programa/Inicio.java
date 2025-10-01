package programa;

import produtos.Livro;
import produtos.ProdutoFisico;

public class Inicio {
    public static void main(String[] args) {
        Livro acotar = new Livro("Acotar Livro 1", 239);
        System.out.println(
                "Nome: " + acotar.getNomeDoLivro() + "\n" +
                "Valor: " + acotar.getValorDoLivro() + "\n" +
                "Valor após desconto de 10%: " + acotar.calcularPrecoFinal()
        );
        System.out.println("-----------------------------");

        ProdutoFisico chocolate = new ProdutoFisico("Chocolate", 20);
        System.out.println(
                "Nome: " + chocolate.getNomeDoProduto() + "\n" +
                "Valor: " + chocolate.getValorDoProduto() + "\n" +
                "Valor após imposto de 20%: " + chocolate.calcularPrecoFinal()
        );

    }
}
