package ofertas;

public class Produto extends Item implements Vendavel{

    @Override
    public double precoTotalDeAcordoComQuantidade() {

        if (quantidade > 20) {
            return custoFinal = (custo - (custo * 0.1)) * quantidade;
        }
        else  {
            return custoFinal = custo * quantidade;
        }


    }

    @Override
    public void exibirFichaTecnicaItem() {
        System.out.println(
                "Produto: " + getNome() + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Custo da unidade: " + custo + "\n" +
                "Custo final do pedido: " + precoTotalDeAcordoComQuantidade()
        );
    }
}
