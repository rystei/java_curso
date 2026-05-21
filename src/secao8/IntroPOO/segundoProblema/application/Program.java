package secao8.IntroPOO.segundoProblema.application;

import secao8.IntroPOO.segundoProblema.entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Product x;
        x = new Product();

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as informações: Nome, Preço, Quantidade");
        x.name = sc.nextLine();
        x.price = sc.nextDouble();
        x.quantity = sc.nextInt();

        x.showProduct();
        x.totalValueInStock();
        System.out.println("Adicione um produto: ");
        int quantidade = sc.nextInt();
        x.addProducts(quantidade);
        x.showProduct();
        System.out.println("Adicione um retirada: ");
        int retirada = sc.nextInt();
        x.removeProducts(retirada);
        x.showProduct();

        sc.close();
    }

}
