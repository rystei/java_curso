package exercicios.secao10.vetores.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    /*
    Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar: ");
        int n = scanner.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: " );

        for (int numero : vect) {
            if (numero < 0) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
