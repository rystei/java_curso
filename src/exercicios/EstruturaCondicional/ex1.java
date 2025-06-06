//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
package exercicios.EstruturaCondicional;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número");
        int numero = scanner.nextInt();

        if (numero < 0 ){
            System.out.println("O numéro " + numero + " é negativo");
        } else {
            System.out.println("O numéro " + numero + " é positivo");
        }
    }
}
