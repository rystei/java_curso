package exercicios.secao5.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();


        if (numero1 > 0 && numero2 > 0 ) {
            System.out.println("Q1");
        } else if (numero1 < 0 && numero2 > 0 ) {
            System.out.println("Q2");
        } else if (numero1 < 0 && numero2 < 0 ) {
            System.out.println("Q3");
        } else if (numero1 > 0 && numero2 < 0 ) {
            System.out.println("Q4");
        } else if (numero1 == 0 && numero2 == 0 ) {
            System.out.println("Origem");
        } else {
            System.out.println("Erro coordenadas !");
        }

    }
}
