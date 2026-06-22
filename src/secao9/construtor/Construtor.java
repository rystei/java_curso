package secao9.construtor;

//Executa no momento da instanciação do objeto
// Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão

import secao9.construtor.Product;

import java.util.Locale;
import java.util.Scanner;
public class Construtor {

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

        Product x = new Product(name, price, quantity);

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

