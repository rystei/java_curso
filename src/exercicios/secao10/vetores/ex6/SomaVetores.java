package exercicios.secao10.vetores.ex6;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int quantiade = scanner.nextInt();
        int[] vetor1 = new int[quantiade];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = scanner.nextInt();
        }

        int[] vetor2 = new int[quantiade];

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = scanner.nextInt();
        }

        System.out.println("VALOR RESULTANTE: ");

        int[] soma = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
            System.out.println(soma[i]);
        }
        
        scanner.close();
    }
}
