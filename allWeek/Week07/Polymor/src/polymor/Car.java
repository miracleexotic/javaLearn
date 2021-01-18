package polymor;

public class Car extends Vehicle implements Flyable {
    public Car(String id) {
        super(id);
    }
    
    public void drive() {
        System.out.println("Car " + super.getId() + " is driving.");
    }
    
    public void fly() {
        System.out.println("Car " + super.getId() + " can fly.");
    }
    
}
