package secao3;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrada string: ");
        String x = scanner.next();
        System.out.println("Saida string " + x);
        System.out.print("Entrada int: ");
        int y = scanner.nextInt();
        System.out.println("Saida int " + y);
        System.out.print("Entrada double: ");
        double a = scanner.nextDouble();
        System.out.println("Saida double " + a);

    }

}
