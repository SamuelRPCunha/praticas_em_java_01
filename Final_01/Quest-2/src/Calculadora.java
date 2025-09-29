import java.util.Scanner;

public class Calculadora {
    int numero;

    void receberValor() {
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = pergunta.nextInt();
    }

    void dobroDoNumero () {
        numero = numero * 2;

        System.out.println("O seu número após o cálculo é igual à: " + numero);
    }
}
