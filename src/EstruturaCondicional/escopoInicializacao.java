package EstruturaCondicional;

import java.util.Scanner;

/** Escopo é uma variável: é a região do programa onde a variável é valida, ou seja onde ela pode
 * ser referenciada.
 * Uma variável não pode ser usada se não usada.
 */
public class escopoInicializacao {
    public static void main(String[] args) {
        //ERRADO
//        double price = 400.00;
//
//        if (price < 200.00) {
//            double discount = price * 0.1;
//        }
//        System.out.println(discount); erro não pode ser usada pois está fora do escopo do if
        //CORRETO
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount;
        if (price < 200.00) {
             discount = price * 0.1;
        } else {
            discount = 0;
        }
        System.out.println(discount);

        sc.close();
    }
}
