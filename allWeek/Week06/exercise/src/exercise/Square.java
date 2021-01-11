package exercise;

public class Square extends Geometry {
    
    public Square() {
        super();
    }
    
    public Square(int side_lenght) {
        super(side_lenght);
        super.setType("Square");
    }
    
    public double calculateArea() {
        return super.getSideLenght() * super.getSideLenght();
    }
}
