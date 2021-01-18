package polymor;

/**
 *
 * @author IAMMAI
 */
public class MainClass {

    public static void main(String[] args) {
//        Animal ani = new Animal("Anime", 1, "catoon");
//        describe(ani, "animal food");
        System.out.println(Animal.staticVariable);
        
        Animal dog = new Dog("Bobby", 2);
//        dog.setName("Bob");
        describe(dog, "dog food");
        
        Animal cat = new Cat("Kitty", 3);
        describe(cat, "cat food");
        
        Animal corki = new Corki("Corki", 4);
        describe(corki, "corki food");
        
        System.out.println(Animal.staticVariable);
        Animal.staticVariable = "Change value on Main class";
        System.out.println(Animal.staticVariable);
        
        Plane plane = new Plane("OOT-12");
        plane.drive();
        flyable(plane);
        
        Bird bird = new Bird("firer", 2);
        flyable(bird);
        
        Car car = new Car("OOT-Car-1");
        car.drive();
        flyable(car);
    }
    
    public static void describe(Animal animal, String food) {
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Type: " + animal.getType());
        animal.eat(food);
        System.out.println();
    }
    
    public static void flyable(Flyable flyable) { // polymorphism same as extends
        flyable.fly();
    }
    
}
