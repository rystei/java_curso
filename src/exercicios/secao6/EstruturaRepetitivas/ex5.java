package exercicios.secao6.EstruturaRepetitivas;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int fatotial = 1;

        for (int i=1; i<=x; i++){
             fatotial = fatotial  * i;
        }
        System.out.println(fatotial);

        scanner.close();

    }

}
