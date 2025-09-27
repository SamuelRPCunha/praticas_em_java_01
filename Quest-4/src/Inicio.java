public class Inicio {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.modelo = "HB20";
        carro.cor = "Rosa";
        carro.ano = 1980;
        carro.exibirFichaTecnica();

        carro.idadeDoCarro();


    }
}