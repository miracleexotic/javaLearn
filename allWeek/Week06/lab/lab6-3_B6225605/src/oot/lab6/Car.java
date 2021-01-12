package oot.lab6;

public class Car {
    private String plate;
    private int horseSpeed;
    private String owner;
    private String type = "Car";
    
    public Car() {
    }
    
    public Car(String plate, int horseSpeed, String owner) {
        this.plate = plate;
        this.horseSpeed = horseSpeed;
        this.owner = owner;
        System.out.println("Create new car \"" + plate + "\"");
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public void setHorseSpeed(int horseSpeed) {
        this.horseSpeed = horseSpeed;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getPlate() {
        return plate;
    }
    
    public int getHorseSpeed() {
        return horseSpeed;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public String getType() {
        return type;
    }
    
    public void describe() {
        System.out.println("=== Describe " + type + " ===");
        System.out.println("Plate: " + plate);
        System.out.println("Horsepower: " + horseSpeed);
        System.out.println("Owner: " + owner + "\n");
    }
    
}
