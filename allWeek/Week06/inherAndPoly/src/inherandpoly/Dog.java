package inherandpoly;

public class Dog extends Animal {
    
    //Add constructor -> this will call superclass first.
    public Dog() {
    }
    
    public Dog(String name, int age) {
        super(name, age);
        System.out.println("constructor of Dog.");
    }
    
    public void eat(String food) {
        System.out.println(super.getName() + " eat a lot of " + food + ".");
    }
    
    public void eat() {
        System.out.println(super.getName() + " eat food same as it's size.");
    }
    
}
