package Lab1_2;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = in.nextFloat();
        System.out.print("Enter b: ");
        float b = in.nextFloat();
        float c = (float)Math.pow((Math.pow((double)a, 2)+Math.pow((double)b, 2)), 0.5);
        System.out.println("The Hypotenuse c is " + c);
    }
    
}
