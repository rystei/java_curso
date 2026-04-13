package exercicios.secao6.EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
* */
public class ex3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=0; i<n; i++) {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            double media = (num1 * 2.0 + num2 * 3.0 + num3 * 5.0) / 10;

            System.out.printf("%.1f%n", media);
        }

        scanner.close();
    }

}
