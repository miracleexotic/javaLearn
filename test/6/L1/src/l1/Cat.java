package l1;

public class Cat extends Animal {
    private String type;
    
    public Cat() {
        System.out.println("new Cat.");
    }
    public Cat(String name, String color, String type) {
        this.type = type;
        System.out.println(name + " is " + color + " " + type + " cat.");
    }
    public void sound() {
        System.out.println("Cat sounds are Meow.\n");
    }
}
