package secao8.IntroPOO.estaticoV2.application;

import secao8.IntroPOO.estatico2.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumferance: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();
    }

}
