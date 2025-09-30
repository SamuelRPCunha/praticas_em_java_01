package entidade;

public class ModeloCarro extends Carro {
    private int quantidadeDeModelos;

    public void definirNomeModeloDeCarro(String nomeModeloDeCarro) {
        this.nomeModeloDeCarro = nomeModeloDeCarro;
        quantidadeDeModelos++;
    }

    public void definirPrecoDurante3Anos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public int getQuantidadeDeModelos() {
        return quantidadeDeModelos;
    }
}
