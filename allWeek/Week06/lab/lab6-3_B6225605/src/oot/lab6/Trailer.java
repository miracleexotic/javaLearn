package oot.lab6;

public class Trailer extends Truck {
    private int trail;
    
    public Trailer() {
    }
    
    public Trailer(String name, int horseSpeed, String owner, double carryWeight, int trail) {
        super(name, horseSpeed, owner, carryWeight);
        super.setType("Trailer");
        this.trail = trail;
    }
    
    public void setTrail(int trail) {
        this.trail = trail;
    }
    
    public int getTrail() {
        return trail;
    }
    
    public void describe() {
        System.out.println("=== Describe " + super.getType() + " ===");
        System.out.println("Plate: " + super.getPlate());
        System.out.println("Horsepower: " + super.getHorseSpeed());
        System.out.printf("Maximum Weight(kg): %.0f\n", super.getCarryWeight());
        System.out.println("Maximum Tail: " + trail);
        System.out.println("Owner: " + super.getOwner() + "\n");
    }
    
}
