package entidade;

public class Carro {
    protected String nomeModeloDeCarro;
    protected double precoAno1, precoAno2, precoAno3;

    public double mediaDePrecoDurante3Anos () {
        return ((precoAno1 + precoAno2 + precoAno3)/3);
    }

    public void calcularMaiorEMenorPreco(){
        if(precoAno1 < precoAno2 && precoAno1 < precoAno3){
            if (precoAno2 > precoAno3){
                System.out.println("O menor preço foi de: R$" + precoAno1 +
                        "\nE o maior preço foi de: R$" + precoAno2);
            }
            else {
                System.out.println("O menor preço foi de: R$" + precoAno1 +
                        "\nE o maior preço foi de: R$" + precoAno3);
            }
        }

        else if (precoAno2 < precoAno1 && precoAno2 < precoAno3) {
            if (precoAno1 > precoAno3){
                System.out.println("O menor preço foi de: R$" + precoAno2 +
                        "\nE o maior preço foi de: R$" + precoAno1);
            }
            else {
                System.out.println("O menor preço foi de: R$" + precoAno2 +
                        "\nE o maior preço foi de: R$" + precoAno3);
            }
        } else if (precoAno3 < precoAno1 && precoAno3 < precoAno2) {
            if (precoAno1 > precoAno2){
                System.out.println("O menor preço foi de: R$" + precoAno3 +
                        "\nE o maior preço foi de: R$" + precoAno1);
            }
            else {
                System.out.println("O menor preço foi de: R$" + precoAno3 +
                        "\nE o maior preço foi de: R$" + precoAno2);
            }
        }
        else {
            System.out.println("ERRO!!!!!!");
        }
    }


    public void exibirFichaTecnica () {
        System.out.println("Modelo do Carro: " + this.nomeModeloDeCarro);
        System.out.println("Valores dos carros durantes os três anos: 1º " + precoAno1 + ", 2º " + precoAno2 + ", 3º " + precoAno3);
        System.out.println("A média de preço durante os três anos foi de: " + mediaDePrecoDurante3Anos());
        calcularMaiorEMenorPreco();
    }





}
