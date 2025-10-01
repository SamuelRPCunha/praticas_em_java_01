package calculos;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double contacaoDolar = 5.32;
        double valorReal = valorDolar * contacaoDolar;

        System.out.println("Dolar: " + valorReal);
    }
}
