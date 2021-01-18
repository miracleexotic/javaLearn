package polymor;

public abstract class Vehicle implements Drivable {
    private String id;
    
    public Vehicle(String id) {
        this.id = id;
        System.out.println(id + " Created");
    }
    
    public String getId() {
        return id;
    }
    
}
