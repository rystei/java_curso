package exercicios.secao10.vetores.ex7;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = scanner.nextInt();
        double[] numeros = new double[quantidade];

        double soma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        System.out.print("MEDIA DO VETOR = " + media);
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}
