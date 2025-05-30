// Programa para controle de estoque e vendas de um produto.

package exercicios;

import java.util.Scanner;

public class EstoqueVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = sc.nextLine().toUpperCase();

        System.out.print("Informe o preço unitário: ");
        double precoUnitario = sc.nextDouble();
        sc.nextLine();

        System.out.print("Informe a quantidade em estoque: ");
        int quantidadeProduto = sc.nextInt();

        System.out.println("\nProduto: " + nomeProduto);
        System.out.printf("Preço: R$ %.2f%n", precoUnitario);
        System.out.println("Estoque atual: " + quantidadeProduto + " unidades");

        System.out.print("\nQuantas unidades deseja vender? ");
        int querVender = sc.nextInt();
        if (querVender <= quantidadeProduto) {
            double valorVenda = querVender * precoUnitario;
            quantidadeProduto -= querVender;
            System.out.printf("Venda realizada! Valor total: R$ %.2f%n", valorVenda);
        } else {
            System.out.println("O estoque é insuficiente.");
        }

        System.out.print("\nQuantas unidades deseja repor? ");
        int repor = sc.nextInt();
        quantidadeProduto += repor;

        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("Estoque final: " + quantidadeProduto + " unidades");
        System.out.printf("Valor total em estoque: R$ %.2f%n", quantidadeProduto * precoUnitario);

        sc.close();
    }
}
