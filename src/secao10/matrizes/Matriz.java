package secao10.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int mat = scanner.nextInt();
            }
        }

    }
}
