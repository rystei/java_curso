package exercicios.secao10.vetores.ex2;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    /*
    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = scanner.nextInt();
        double[] vetor = new double[n];

        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        System.out.println();

        System.out.print("VALORES = " );

        for (double valor : vetor) {
            System.out.print(valor + "  ");
        }

        System.out.println();

        double media = soma / vetor.length;

        System.out.printf("Soma = %.2f%n", soma);
        System.out.printf("Média = %.2f%n", media);

        scanner.close();
    }
}
