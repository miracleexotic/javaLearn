package oot.lab6;

public class Supercar extends Car {
    
    public Supercar() {
    }
    
    public Supercar(String name, int horseSpeed, String owner) {
        super(name, horseSpeed, owner);
        super.setType("Spercar");
    }
    
}
