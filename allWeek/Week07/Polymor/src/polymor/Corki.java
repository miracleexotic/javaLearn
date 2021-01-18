package polymor;

public final class Corki extends Dog{
    public Corki(String name, int age) {
        super(name, age);
        Cat.calculate();
    }
}
