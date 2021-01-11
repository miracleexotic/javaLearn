package exercise;

public class Geometry {
    private int side_lenght;
    private String type = "Geometry";
    
    public Geometry() {
    }
    
    public Geometry(int side_lenght) {
        this.side_lenght = side_lenght;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setSideLenght(int side_lenght) {
        this.side_lenght = side_lenght;
    }
    
    public int getSideLenght() {
        return side_lenght;
    }
    
    public double calculateArea() {
        return side_lenght;
    }
}
