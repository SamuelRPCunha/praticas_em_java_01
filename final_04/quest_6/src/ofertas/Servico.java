package ofertas;

public class Servico extends Item implements Vendavel{


    @Override
    public double precoTotalDeAcordoComQuantidade() {
        if (quantidade < 3) {
            return custoFinal = (custo + (custo * 0.2)) * quantidade;
        }

        else {
            return custoFinal = (custo - (custo * 0.1)) * quantidade;
        }
    }

    @Override
    public void exibirFichaTecnicaItem() {
        System.out.println(
                "Serviço: " + getNome() + "\n" +
                "Vezes que foi requisitado: " + quantidade + "\n" +
                "Custo do serviço: " + custo + "\n" +
                "Custo final do serviço: " + precoTotalDeAcordoComQuantidade()
        );
    }
}
