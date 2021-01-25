public class Area extends Shape {
    public Area() {

    }

    public void RectangleArea(int h, int w) {
        System.out.println(0.5 * h * w);
    }

    public void SquareArea(int s) {
        System.out.println(s * s);
    }

    public void CircleArea(int r) {
        System.out.println(Math.PI * r * r);
    }
}
