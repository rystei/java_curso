package secao9.sobrecarga;

// É possivel ter mais de 1 versão da mesma operação desde que mude os parâmetros

public class Sobrecarga {

    public String name;
    public double price;
    public int quantity;

    public Sobrecarga(){

    }

    public Sobrecarga(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Sobrecarga(String name, double price) {
        this.name = name;
        this.price = price;
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