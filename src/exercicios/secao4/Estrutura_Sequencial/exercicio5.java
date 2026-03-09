package exercicios.secao4.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int codigoPeça1 = scanner.nextInt();
        int numeroPeça1 = scanner.nextInt();
        double precoPeca1 = scanner.nextDouble();
        int codigoPeça2 = scanner.nextInt();
        int numeroPeça2 = scanner.nextInt();
        double precoPeca2 = scanner.nextDouble();
        double total = (numeroPeça1 * precoPeca1) +  (numeroPeça2 * precoPeca2);

        System.out.println("VALOR A PAGAR: R$ " + total );


    }
}
