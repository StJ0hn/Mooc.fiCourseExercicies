package Part_I.Module_05.Ex_05_ConstructorOverload;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight){
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product (String name){
        this(name, "Shelf", 1);
    }

    public Product(String name, String location){
        this(name, location, 1);
    }

    public Product(String name, int weight){
        this(name, "Shelf", weight);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) at " + this.location;
    }
}
