// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
package exercicios.secao5.EstruturaCondicional;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        scanner.close();
    }
}
