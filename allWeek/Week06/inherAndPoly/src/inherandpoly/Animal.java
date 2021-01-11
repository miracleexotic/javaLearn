package inherandpoly;

public class Animal {
    private String name;
    private int age;
    
    //Add constructor
    public Animal() {
        System.out.println("constructor of Animal.");
    }
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
        
    public String getName() {
        return name;
    }
    
    public void eat(String food) {
        System.out.println(name + " eat " + food);
    }
    
    public void eat() {
    }
    
}
