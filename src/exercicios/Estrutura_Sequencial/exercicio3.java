//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package exercicios.Estrutura_Sequencial;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.print("Por favor, informe o valor de A: ");
        A = sc.nextInt();

        System.out.print("Por favor, informe o valor de B: ");
        B = sc.nextInt();

        System.out.print("Por favor, informe o valor de C: ");
        C = sc.nextInt();

        System.out.print("Por favor, informe o valor de D: ");
        D = sc.nextInt();

        diferenca = A * B - C * D;

        System.out.printf("DIFERENÇA = %d ", diferenca);

        sc.close();
    }
}
