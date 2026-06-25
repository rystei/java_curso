package secao9.encapsulamento;

//Esconder os dados internos de uma classe (atributos)
//Controlar o acesso e esses dados usando metodos públicos (getters e setters)

import java.util.Locale;
import java.util.Scanner;

public class Encapsulamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        secao9.encapsulamento.Product x = new secao9.encapsulamento.Product(name, price, quantity);

        x.setName("carro");
        System.out.println("Novo produto " +  x.getName());

        x.setPrice(1.50);
        System.out.println("Novo preço " + x.getPrice());

        System.out.println();
        System.out.println("Product data: " + x);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantidade = sc.nextInt();
        x.addProducts(quantidade);

        System.out.println();
        System.out.println("Updated data: " + x);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int removeProducts = sc.nextInt();
        x.removeProducts(removeProducts);

        System.out.println();
        System.out.println("Updated data: " + x);

        sc.close();
    }
}
