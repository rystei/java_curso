package exercicios.secao10.vetores.ex4;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
        }

        int quantidadePares = 0;

        System.out.println("NUMEROS PARES");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + "  ");
                quantidadePares++;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + quantidadePares);


        scanner.close();
    }
}
