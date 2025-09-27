public class Inicio {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Return of the Mack";
        musica.artista = "Oreeyo";
        musica.anoLancamento = 2021;

        musica.fichaTecnica();

        musica.avaliarMusica();
        musica.avaliarMusica();
        musica.avaliarMusica();

        System.out.println("A média de avaliações é igual à: " + musica.mediaDeAvaliacoes());
    }
}
