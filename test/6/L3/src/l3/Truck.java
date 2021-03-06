package l3;

public class Truck extends Car {
    private double carryWeight;
    public Truck() {}
    public Truck(String plate, int horseSpeed, String owner, double carryWeight) {
        super(plate, horseSpeed, owner);
        super.setType("Truck");
        this.carryWeight = carryWeight;
    }
    public void describe() {
        System.out.println("=== Describe " + super.getType() + " ===");
        System.out.println("Plate: " + super.getPlate());
        System.out.println("HorseSpeed: " + super.getHorseSpeed());
        System.out.println("Maximum Weight(kg): " + carryWeight);
        System.out.println("Owner: " + super.getOwner() + "\n"); 
    }
    
    public double getCarryWeight() {
        return carryWeight;
    }
}
