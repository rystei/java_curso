package exercicios.secao5.EstruturaCondicional;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("IMPAR");
        }
        scanner.close();
    }
}
