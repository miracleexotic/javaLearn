import java.util.Scanner;

public class area {

    public static int rectangle(int width, int height) {
        return width * height;
    }

    public static int square(int width) {
        // return width * width;
        return rectangle(width, width);
    }

    public static double triangle(double width, double height) {
        return 0.5 * width * height;
    }

    public static void main(String[] args) {
        System.out.println(triangle(4, 5.6));

        float vatRate = 0.07f; // 0.07F or 0.07f

        double d1 = 1.0/3.0;
        float f1 = 1.0f/3.0f;

        System.out.println("double: " + d1);
        System.out.println("float: " + f1);
        /*
        System.out.println(3 * 5);
        System.out.println("area = " + 3 * 5);
        
        int width; // -2^31 to 2^31-1
        int height;
        int area;
        // width = 3;
        // height = 5;
        // area = width * height;
        // System.out.println("area = " + area);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = in.nextInt();
        // System.out.println("print width = " + width);
        System.out.print("Enter height: ");
        height = in.nextInt();
        area = rectangle(width, height);
        System.out.println("area (" + width + " x " + height + ") = " + area);
        System.out.println(square(5));
        */

    }

}
