public class Inicio {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto 1", 1000);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preco do produto: " + produto.getPreco());

        produto.aplicarDesconto(10);

        System.out.println("Produto com desconto aplicado: " + produto.getPreco());
    }
}
