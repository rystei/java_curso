package exercicios.secao8.introPOO.exerc1.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.secao8.introPOO.exerc1.entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();


        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n3.00", rectangle.Diagonal());
        sc.close();
    }
    
}
