package l3;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("7447", 150, "Somchai");
        car.describe();
        
        Supercar supercar = new Supercar("Red-Plate", 450, "David");
        supercar.describe();
        
        Truck truck = new Truck("5554", 300, "Somsak", 1000);
        truck.describe();
        
        Trailer trailer = new Trailer("4768", 500, "Sompong", 10000, 2);
        trailer.describe();
        
        manage(car);
        manage(supercar);
        manage(truck);
        manage(trailer);
    }
    public static void manage(Car car) {
        System.out.println(car.getOwner() + " drive car plate " + car.getPlate() + ".");
    }
    
}
