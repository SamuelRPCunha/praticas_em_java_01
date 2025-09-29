import java.util.Scanner;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    double somaAvaliacao;
    double numeroDeAvaliacoes;

    void fichaTecnica() {
        System.out.println("Ficha Tecnica");
        System.out.println("---------------------");
        System.out.println("Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("---------------------");
    }

    void avaliarMusica() {
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Qual nota daria para a seguinte música? ");
        avaliacao = pergunta.nextDouble();
        somaAvaliacao += avaliacao;

        numeroDeAvaliacoes++;
    }

    double mediaDeAvaliacoes() {
        return (somaAvaliacao / numeroDeAvaliacoes);
    }

}
