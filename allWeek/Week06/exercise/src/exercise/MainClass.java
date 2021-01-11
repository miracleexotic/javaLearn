package exercise;

/**
 *
 * @author B6225605-นายณัฐวัตร-บุญโสดากร
 */
public class MainClass {

    public static void main(String[] args) {
        Geometry geometry = new Geometry(5);
        doProcess(geometry);
        
        Geometry tri = new Triangle(8);
        doProcess(tri);
        
        Geometry sq = new Square(4);
        doProcess(sq);
    }
    
    public static void doProcess(Geometry geometry) {
//        System.out.println("Type: " + geometry.getClass().getSimpleName());
        System.out.println("Type: " + geometry.getType());
        System.out.println("Lenght: " + geometry.getSideLenght());
        System.out.printf("Area: %.6f\n\n", geometry.calculateArea());
    }
}
