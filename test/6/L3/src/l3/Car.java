package l3;

public class Car {
    private String plate;
    private int horseSpeed;
    private String owner;
    private String type = "Car";
    
    public Car() {
        
    }
    
    public Car(String plate, int horseSpeed, String owner) {
        System.out.println("Create new car \"" + plate + "\"");
        this.plate = plate;
        this.horseSpeed = horseSpeed;
        this.owner = owner;
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
    
    public String getPlate() {
        return plate;
    }
    
    public int getHorseSpeed() {
        return horseSpeed;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void describe() {
        System.out.println("=== Describe " + type + " ===");
        System.out.println("Plate: " + plate);
        System.out.println("HorseSpeed: " + horseSpeed);
        System.out.println("Owner: " + owner + "\n");
    }
}
