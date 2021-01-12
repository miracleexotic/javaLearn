package oot.lab6;

public class Cat extends Animal {

    private String type; // 2
    
    public Cat() {
        System.out.println("new Cat.");
    }
    
    public Cat(String name, String color, String type) {
        super(name, color); // 3
        System.out.println(name + " is " + color + " " + type + " cat.");
    }
    
    public void sound() {
        System.out.println("Cat sounds are Meow.\n");
    }

}
