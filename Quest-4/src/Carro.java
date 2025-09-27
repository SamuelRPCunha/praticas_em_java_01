public class Carro {
    String modelo, cor;
    int ano, idade;

    void exibirFichaTecnica(){
        System.out.println("Ficha Tecnica");
        System.out.println("-------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("-------------------");
    }

    void idadeDoCarro(){
        idade = 2025 - ano;

        System.out.println("O carro tem idade de: " + idade + " anos");
    }
}
