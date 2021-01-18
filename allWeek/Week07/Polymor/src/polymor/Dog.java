package polymor;

public class Dog extends Animal {  

    public Dog(String name, int age) {
        super(name, age, "dog");
    }
    
    public void eat(String food) { // overriding to complete method abstract
        System.out.println("Dog name " + super.getName() + " eat " + food);
    }
    
}
