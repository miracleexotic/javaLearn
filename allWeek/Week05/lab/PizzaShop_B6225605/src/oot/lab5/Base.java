package oot.lab5;

public class Base {
    private String name = "";
    private double price = 0;
    
    public Base() {
    }
    
    public Base(String name, double price) {
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
