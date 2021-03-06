package l3;

public class Supercar extends Car {
    public Supercar() {
        
    }
    public Supercar(String plate, int horseSpeed, String owner) {
        super(plate, horseSpeed, owner);
        super.setType("Supercar");
    }
}
