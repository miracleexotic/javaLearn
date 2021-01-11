package exercise;

public class Triangle extends Geometry {
    
    public Triangle() {
    }
    
    public Triangle(int side_lenght) {
        super(side_lenght);
        super.setType("Triangle");
    }
    
    //root3 / 4 * a ** 2
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * Math.pow(super.getSideLenght(), 2);
    }
}
