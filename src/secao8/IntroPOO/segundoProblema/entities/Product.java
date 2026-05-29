package secao8.IntroPOO.segundoProblema.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

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
