package exercicios.secao6.EstruturaRepetitivas;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char repete;
        do {

            System.out.println("Digite a temperatura em Celsius: ");
            double c = scanner.nextDouble();
            double f = (c * 1.8) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.println("Desejar repetir (s/n)?");
            repete = scanner.next().charAt(0);
        } while (repete != 'n');
        scanner.close();

    }
}