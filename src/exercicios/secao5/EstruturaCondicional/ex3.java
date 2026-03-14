package exercicios.secao5.EstruturaCondicional;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if (a % b == 0 || b % a == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
        scanner.close();
    }
}
