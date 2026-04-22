package exercicios.secao6.EstruturaRepetitivas;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char continuar;
        do {
            System.out.println("Digite um numero em celsius");
            double c = scanner.nextDouble();
            double f = (c * 1.8) + 32;
            System.out.println("equivalente em farenheit " + f);
            System.out.println("Deseja continuar (s/n)");
            continuar = scanner.next().charAt(0);
        } while (continuar != 'n');
            System.out.println("Fim");
        scanner.close();
    }
}