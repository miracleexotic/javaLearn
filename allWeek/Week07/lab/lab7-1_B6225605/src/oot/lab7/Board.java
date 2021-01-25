package oot.lab7;

public class Board extends Person {

    private int shareholding;

    public Board(String name, int shareholding) {
        super(name);
        this.shareholding = shareholding;
    }

    public void getDetails() { // 3
        System.out.println("=== Board ===");
        System.out.println("Name: " + super.getName());
        System.out.println("Shareholding (%): " + shareholding);
    }
}
