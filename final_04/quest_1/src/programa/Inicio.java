package programa;

import calculos.ConversorMoeda;

public class Inicio {
    public static void main(String[] args) {

        ConversorMoeda moeda = new ConversorMoeda();

        moeda.converterDolarParaReal(10);
    }
}
