package calculos;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostraTabuada(int numeroDesejado) {
        for (int numeroMultiplicador = 1; numeroMultiplicador <= 10; numeroMultiplicador++) {
            int resultado = numeroDesejado * numeroMultiplicador;
            System.out.println(numeroDesejado + " x " + numeroMultiplicador + " = " + resultado);
        }
    }
}
