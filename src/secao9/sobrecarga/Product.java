package secao9.sobrecarga;

// É possivel realizar mais de uma operação em uma classe utilizando o mesmo 'nome' porém com diferentes listas de parâmetros;

import java.util.Locale;
import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();
//
//        secao9.sobrecarga.Sobrecarga x = new secao9.sobrecarga.Sobrecarga(name, price, quantity);


        secao9.sobrecarga.Sobrecarga x = new secao9.sobrecarga.Sobrecarga(name, price); // sobrecarga

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
