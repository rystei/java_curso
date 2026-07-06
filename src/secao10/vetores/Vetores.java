package secao10.vetores;

// Vetores (ou arrays) são estruturas de dados que armazenam múltiplos valores do mesmo tipo numa única variável
//EX: Você quer armazenar os valores de 5 alunos. Pode usar um vetor de double para isso, em vez de criar 5 variaveis separadas
//int[] numeros = new int[5];
//int[] numeros = {10, 20, 30, 40, 50};

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        double[] vetor = new double[numero];

            for (int i = 0; i < numero; i++) {
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < numero; i++) {
            soma += vetor[i];
        }

        double media = soma / numero;

        System.out.printf("A média é:  %.2f%n" , media);
    }

}
