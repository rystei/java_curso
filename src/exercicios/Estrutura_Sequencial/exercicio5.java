//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package exercicios.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        System.out.print("Insira o código 1: ");
        cod1 = sc.nextInt();
        System.out.print("Insira a quantidade 1: ");
        qte1 = sc.nextInt();
        System.out.print("Insira o preço 1: ");
        preco1 = sc.nextDouble();

        System.out.print("Insira o código2: ");
        cod2 = sc.nextInt();
        System.out.print("Insira a quantidade 2: ");
        qte2 = sc.nextInt();
        System.out.print("Insira o preço 2: ");
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("Valor a pagar %.2f%n", total);

    }
}
