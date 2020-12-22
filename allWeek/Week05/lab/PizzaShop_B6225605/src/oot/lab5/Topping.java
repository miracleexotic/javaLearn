package oot.lab5;

public class Topping {
    private String name = "";
    private double price = 0;
    
    public Topping() {
    }
    
    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    
}
