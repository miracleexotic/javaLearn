package l3;

public class Trailer extends Truck {
    private int trail;
    public Trailer() {}
    public Trailer(String plate, int horseSpeed, String owner, double carryWeight, int trail) {
        super(plate, horseSpeed, owner, carryWeight);
        super.setType("Trailer");
        this.trail = trail;
    }
    public void describe() {
        System.out.println("=== Describe " + super.getType() + " ===");
        System.out.println("Plate: " + super.getPlate());
        System.out.println("HorseSpeed: " + super.getHorseSpeed());
        System.out.println("Maximum Weight(kg): " + super.getCarryWeight());
        System.out.println("Maximum Trail: " + trail);
        System.out.println("Owner: " + super.getOwner() + "\n"); 
    }
}
