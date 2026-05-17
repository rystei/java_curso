package secao7.outrosTopicosJava;

import java.util.Scanner;

public class Higher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int higher = max(n1, n2, n3);

        showResut(higher);

        scanner.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x> z) {
           aux = x;
        } else if (y > x) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResut(int value) {
        System.out.println("Higher = " + value);
    }

}
