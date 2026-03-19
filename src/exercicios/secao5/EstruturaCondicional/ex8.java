package exercicios.secao5.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double renda = scanner.nextDouble();
        
        if (renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda <= 3000.00 ) {
           double imposto = (renda - 2000.0) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (renda <= 4500.00 ) {
            double imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else  {
            double imposto = (renda - 4500.0)* 0.28 + 1500.00 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
