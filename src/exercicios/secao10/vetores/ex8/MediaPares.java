package exercicios.secao10.vetores.ex8;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = scanner.nextInt();
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }

        int somaPares = 0;
        int quantidadePares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantidadePares++;
            }
        }

        double mediaPares;
        if (quantidadePares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares = (double) somaPares / quantidadePares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
        }

        scanner.close();
    }
}
