//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si.
package exercicios.secao5.EstruturaCondicional;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int A = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int B = scanner.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplo");
        } else {
            System.out.println("Não são multiplos");
        }
        scanner.close();
    }
}
