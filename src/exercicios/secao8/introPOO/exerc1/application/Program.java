package exercicios.secao8.introPOO.exerc1.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.secao8.introPOO.exerc1.entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");

        System.out.print("Width: ");
        rectangle.width = scanner.nextDouble();

        System.out.print("Height: ");
        rectangle.height = scanner.nextDouble();

        System.out.printf("AREA = %.2f%n" , rectangle.area());
        System.out.printf("PERIMETER = %.2f%n" , rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n" , rectangle.diagonal());


    }
}
