package exercicios.secao10.vetores.ex5;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int quantidade = scanner.nextInt();
        double[] numeros = new double[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
        }

        double maiorNumero = numeros[0];
        int indice = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                indice = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorNumero);
        System.out.println("POSICAO DO MAIOR VALOR = " + indice);

        scanner.close();
    }
}
