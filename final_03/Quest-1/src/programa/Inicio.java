package programa;

import entidade.ModeloCarro;

import java.util.ArrayList;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {
        ModeloCarro fiat = new ModeloCarro();

        fiat.definirNomeModeloDeCarro("BMW");
        fiat.definirPrecoDurante3Anos(20000, 28000, 32000);
        fiat.exibirFichaTecnica();

        System.out.println("Quantidade de modelos: " + fiat.getQuantidadeDeModelos());



    }
}
