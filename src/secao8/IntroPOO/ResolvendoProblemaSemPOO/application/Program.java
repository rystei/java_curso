package secao8.IntroPOO.ResolvendoProblemaSemPOO.application;
import java.util.Scanner;

import secao8.IntroPOO.ResolvendoProblemaSemPOO.entities.Triangle;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double pA = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(pA * (pA - x.a) * (pA - x.b) * (pA - x.c) );
        double pB = (y.a + y.b + y.c) / 2;
        double areay = Math.sqrt(pB * (pB - y.a) * (pB - y.b) * (pB - y.c) );


        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areay);

        if (areaX > areay) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }

}