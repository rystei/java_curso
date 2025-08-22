package EstruturaCondicional;

import java.util.Scanner;

public class ternaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

        sc.close();
    }
}
