package polymor;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age, "cat");
    }
    
    public void eat(String food) {
        System.out.println("Cat name " + super.getName() + " eat " + food);
        Animal.staticVariable = "Change value on Cat class";
    }
    
    public static void calculate() {
        System.out.println("Cat calculate 1+1 is 10");
    }
    
}
