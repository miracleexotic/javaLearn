package inherandpoly;

/**
 *
 * @author B6225605-นายณัฐวัตร-บุญโสดากร 
 */
public class MainClass {

    public static void main(String[] args) {
        //Animal ani = new Animal();
        Animal animal = new Animal("Bob", 3);
        describle(animal, "steak");
        
        Animal dog = new Dog("Dog", 1);
        describle(dog, "meat");
        
        Animal cat = new Cat("cat", 4);
        describle(cat, "fish");
        
        Animal pom = new PomPom("PomPom", 2);
        describle(pom, "nothing");

    }
    
    public static void describle(Animal animal, String food) {
        System.out.println("Animal name: " + animal.getName());
        System.out.println("Animal age: " + animal.getAge());
        animal.eat(food);
    }
    
}
