package programa;

import ofertas.Produto;
import ofertas.Servico;

public class Inicio {
    public static void main(String[] args) {
        Produto makita = new Produto();

        makita.setNome("Makita");
        makita.setQuantidade(21);
        makita.setCusto(20.90);

        makita.exibirFichaTecnicaItem();

        System.out.println("------------");

        Servico freteDeMaterial = new Servico();

        freteDeMaterial.setNome("Frete de Material");
        freteDeMaterial.setQuantidade(2);
        freteDeMaterial.setCusto(35);

        freteDeMaterial.exibirFichaTecnicaItem();

    }
}
