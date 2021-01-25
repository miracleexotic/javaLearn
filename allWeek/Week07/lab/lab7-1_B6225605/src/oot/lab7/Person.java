package oot.lab7;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }
    
    public final String getName() { // 1
        return name;
    }

    public abstract void getDetails(); // 2
}
