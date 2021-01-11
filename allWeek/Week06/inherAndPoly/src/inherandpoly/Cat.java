package inherandpoly;

public class Cat extends Animal {
    
    public Cat() {
    }
    
    public Cat(String name, int age) {
        super(name, age);
        System.out.println("Cat do.");
    }
    
}
