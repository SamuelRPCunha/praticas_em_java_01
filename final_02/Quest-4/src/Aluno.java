public class Aluno {
    private String nome;
    private int notas;
    private int quantidadeDeNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(int notas) {
        this.notas += notas;
        quantidadeDeNotas += 1;
    }

    public String getNome() {
        return nome;
    }

    public int getNotas() {
        return notas;
    }

    private int calcularMedia() {
        return notas / quantidadeDeNotas;
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Notas: " + notas);
        System.out.println("A média das notas é igual a " + calcularMedia());
    }
}
