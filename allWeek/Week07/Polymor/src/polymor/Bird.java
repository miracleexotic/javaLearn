package polymor;

public class Bird extends Animal implements Flyable {
    
    public Bird(String name, int age) {
        super(name, age, "bird");
    }
    
    public void eat(String food) {
        System.out.println(super.getName() + " eat " + food);
    }
    
    public void fly() {
        System.out.println(super.getName() + " is fly away from home.");
    }
    
}
