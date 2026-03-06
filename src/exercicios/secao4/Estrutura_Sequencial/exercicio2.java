package exercicios.secao4.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        double raio;
        raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("AREA = " + String.format("%.4f", area));

    }
}
