package l1;

public class Visitor extends Person{
    private String from;
    
    public Visitor(String name, String from) {
        super(name);
        this.from = from;
    }
    
    public void getDetails() {
        System.out.println("=== Visitor ===");
        System.out.println("Name: " + super.getName());
        System.out.println("From: " + from);
    }
}
