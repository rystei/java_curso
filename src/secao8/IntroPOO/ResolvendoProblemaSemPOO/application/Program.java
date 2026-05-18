package secao8.IntroPOO.ResolvendoProblemaSemPOO.application;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X:");

        double area1 = sc.nextDouble();
        double area2 = sc.nextDouble();
        double area3 = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");

        double area4 = sc.nextDouble();
        double area5 = sc.nextDouble();
        double area6 = sc.nextDouble();

        double pA = (area1 + area2 + area3) / 2;
        double areaX = Math.sqrt(pA * (pA - area1) * (pA - area2) * (pA - area3) );
        double pB = (area4 + area5 + area6) / 2;
        double areay = Math.sqrt(pB * (pB - area4) * (pB - area5) * (pB - area6) );


        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areay);

        if (areaX > areay) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }

}