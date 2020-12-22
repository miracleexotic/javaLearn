package oot.lab5;

import java.text.NumberFormat;

public class Pizza {
    private String name = "";
    private Base base;
    private Topping topping;
    private double price = 0;
    private static final NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    public Pizza() {
    }
    
    public Pizza(String name) {
        this.name = name;
    }
    
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Base getBase() {
        return base;
    }
    
    public void setBase(Base base) {
        this.base = base;
        System.out.println("You select " + base.getName());
        price += base.getPrice();
        System.out.println("Pizza price: " + fmt.format(price));
    }
    
    public Topping getTopping() {
        return topping;
    }
    
    public void setTopping(Topping topping) {
        this.topping = topping;
        System.out.println("You select " + topping.getName());
        price += topping.getPrice();
        System.out.println("Pizza price: " + fmt.format(price));
    }
    
    public double getPrice() {
        return price;
    }
    
    //
    public double discounting(double dis) {
        if(dis <= (price / 2.0)) {
            price -= dis;
        } else {
            price -= (price / 2.0);
        }
        return price;
    }
    
    public void summary() {
        System.out.println("===== YOUR PIZZA ORDER =====");
        System.out.println("Pizza: " + name);
        System.out.println("Base: " + base.getName());
        System.out.println("Topping: " + topping.getName());
        System.out.println("Total price: " + fmt.format(price));
    }
    
    
}
