package programa;

import calculos.ConversorTemperaturaPadrao;

public class Inicio {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();

        temperatura.celciusParaFahrenheit(40);
        temperatura.farenheitParaCelcius(30);
    }
}
