package w1;

import java.util.Scanner;

public class MainClass {

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // lab01();
        // lab02();
        // lab03();

    }

    public static void lab01() { // find x1 and x2 ในสมการกำลังสอง
        System.out.print("a : ");
        int a = in.nextInt();
        System.out.print("b : ");
        int b = in.nextInt();
        System.out.print("c : ");
        int c = in.nextInt();

        double x1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double x2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);
    }

    public static void lab02() { // find c in triangle 90 degree
        System.out.print("Enter a : ");
        float a = in.nextFloat();
        System.out.print("Enter b : ");
        float b = in.nextFloat();
        float c = (float) Math.pow((Math.pow((double) a, 2) + Math.pow((double) b, 2)), 0.5);
        System.out.println(c);

    }

    public static void lab03() {  // sum all digit
        System.out.print("Enter number : ");
        int n = in.nextInt();
        int c = n;
        int total = 0;
        while(n > 0 && (n >= 0 && n <= 10000)) {
            total += n%10;
            n /= 10;
        }
        System.out.println("The sum of all digit in " + c + " is " + total);

    }

}
