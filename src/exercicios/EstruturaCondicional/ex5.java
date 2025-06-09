//escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
package exercicios.EstruturaCondicional;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------CARDAPIO------------------");
        System.out.println("codigo = 1, Cachorro Quente, Valor: R%: 4,00");
        System.out.println("codigo = 2, X-Salada, Valor: R%: 4,50");
        System.out.println("codigo = 3, X-Bacon, Valor: R%: 5,00");
        System.out.println("codigo = 4, Pão de Queijo, Valor: R%: 2,00");
        System.out.println("codigo = 5, Refrigerante, Valor: R%: 1,50");

        System.out.println("Qual lanche? ");
        int codigo = scanner.nextInt();
        System.out.println("Quantos? ");
        int quantidade = scanner.nextInt();

        double total = 0.0;
        if (codigo == 1){
             total = quantidade * 4.00;
        } else if (codigo == 2) {
             total = quantidade * 4.50;
        } else if (codigo == 3) {
             total = quantidade * 5.00;
        }
        else if (codigo == 4) {
             total = quantidade * 2.00;
        }
        else if (codigo == 5) {
             total = quantidade * 1.50;
        }

        System.out.printf("Total R$ %.2f%n", total);

        scanner.close();
    }


}
