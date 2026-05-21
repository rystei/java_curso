package secao8.IntroPOO.segundoProblema.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void showProduct(){
        System.out.println("Nome: " + name);
        System.out.println("Preço: " + price);
        System.out.println("Quantidade: " + quantity);
    }

    public void addProducts(int x){
        quantity += x;
    }

    public void removeProducts(int x){
        quantity -= x;
    }

}
