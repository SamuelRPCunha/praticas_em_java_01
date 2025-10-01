package ofertas;

public abstract class Item {
    private String nome;
    protected double custo;
    protected double quantidade;
    protected double custoFinal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public abstract void exibirFichaTecnicaItem();
}
