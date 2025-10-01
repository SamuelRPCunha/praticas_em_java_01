package programa;

import calculos.CalculadoraSalaRetangular;

public class Inicio {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calc = new CalculadoraSalaRetangular();

        calc.calcularArea(20, 14);
        calc.calcularPerimetro(20, 14);
    }
}
