package polymor;

public class Plane extends Vehicle implements Flyable {
    
    public Plane(String id) {
        super(id);
    }
    
    public void drive() {
        System.out.println("Plane " + super.getId() + " is drive to runway.");
    }
    
    public void fly() {
        System.out.println("Plane " + super.getId() + " is fly from airport.");
    }
    
}
