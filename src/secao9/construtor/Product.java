package secao9.construtor;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int x){
        quantity += x;
    }

    public void removeProducts(int x){
        quantity -= x;
    }

    public String toString(){
        return  name +
                ", $ " +
                String.format("%.2f", price) +
                " , " + quantity +
                " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
