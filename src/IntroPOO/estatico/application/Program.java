package IntroPOO.estatico.application;

import IntroPOO.estatico.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n" , c);
        System.out.printf("Volume: %.2f%n" , v);
        System.out.printf("PI Value: %.2f%n" , Calculator.PI);

        scanner.close();
    }

}
