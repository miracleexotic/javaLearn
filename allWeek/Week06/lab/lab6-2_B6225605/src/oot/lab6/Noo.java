package oot.lab6;

public class Noo extends Koo {
    public Noo() {
        System.out.println("Noo constructor");
    }
    
    public void process() {
        System.out.println("Noo doing, override");
    }
    
    public void process(String s) {
        System.out.println("Noo doing, overload\n");
    }
    
}
