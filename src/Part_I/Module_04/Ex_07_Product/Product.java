package Part_I.Module_04.Ex_07_Product;

public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public void printProduct(){
        System.out.println(name + ", price " + price + ", " + quantity + " pcs" );
    }
}
