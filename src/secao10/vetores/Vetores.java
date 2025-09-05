package secao10.vetores;

// Vetores (ou arrays) são estruturas de dados que armazenam múltiplos valores do mesmo tipo numa única variável
//EX: Você quer armazenar os valores de 5 alunos. Pode usar um vetor de double para isso, em vez de criar 5 variaveis separadas
//int[] numeros = new int[5];
//int[] numeros = {10, 20, 30, 40, 50};

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("Average height %.2f%n ", avg);

        sc.close();
    }
}
