package secao8.IntroPOO.estatico.application;

import secao8.IntroPOO.estatico.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumferance: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        scanner.close();
    }

}
