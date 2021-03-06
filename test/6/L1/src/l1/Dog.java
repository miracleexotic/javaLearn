package l1;

public class Dog extends Animal {
    public Dog() {
        System.out.println("new Dog.");
    }
    public Dog(String name, String color) {
        super(name, color);
        System.out.println(name + " is " + color + " dog.");
    }
    public void sound() {
        System.out.println("Dog sounds are Bau-Bau.\n");
    }
    
}
