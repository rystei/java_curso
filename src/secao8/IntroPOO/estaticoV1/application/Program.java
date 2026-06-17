package secao8.IntroPOO.estaticoV1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = circumferance(radius);

        double v = volume(radius);

        System.out.printf("Circumferance: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        scanner.close();
    }

    public static double circumferance(Double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(Double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
