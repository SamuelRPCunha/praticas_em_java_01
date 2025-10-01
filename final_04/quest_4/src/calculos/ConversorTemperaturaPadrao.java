package calculos;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celciusParaFahrenheit(double celcius) {
        double resultadoDeCelciusParaFahrenheit = (celcius * 1.8) + 32;
        System.out.println("A temperatura de " + celcius + "°C em fahrenheit: " + resultadoDeCelciusParaFahrenheit + "°F");
    }

    @Override
    public void farenheitParaCelcius(double farenheit) {
        double resultadoDeFarenheitParaCelcius = (farenheit - 32) * ((double) 5/9);
        System.out.println("A temperatura de " + farenheit + "°F em celcius: " + resultadoDeFarenheitParaCelcius + "°C");
    }
}
