package secao8.IntroPOO.segundoProblema.application;

import secao8.IntroPOO.segundoProblema.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Product x;
        x = new Product();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        x.name = sc.nextLine();
        System.out.print("Price: ");
        x.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        x.quantity = sc.nextInt();

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
