package oot.lab6;

public class Truck extends Car {
    private double carryWeight;
    
    public Truck() {
    }
    
    public Truck(String name, int horseSpeed, String owner, double carryWeight) {
        super(name, horseSpeed, owner);
        super.setType("Truck");
        this.carryWeight = carryWeight;
    }
    
    public void setCarryWeight(double carryWeight) {
        this.carryWeight = carryWeight;
    }
    
    public double getCarryWeight() {
        return carryWeight;
    }
    
    public void describe() {
        System.out.println("=== Describe " + super.getType() + " ===");
        System.out.println("Plate: " + super.getPlate());
        System.out.println("Horsepower: " + super.getHorseSpeed());
        System.out.printf("Maximum Weight(kg): %.0f\n",carryWeight);
        System.out.println("Owner: " + super.getOwner() + "\n");
    }
    
}
