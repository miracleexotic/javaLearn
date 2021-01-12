package oot.lab6;

public class Animal {

    private String name;
    private String color;

    public Animal() {
        System.out.println("new Animal.");
    }

    public Animal(String name, String color) {
        System.out.println("new Animal " + name);
    }

    public void sound() {
        System.out.println("Animal is making a sound.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
