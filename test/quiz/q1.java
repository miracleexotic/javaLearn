package quiz;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        double n = in.nextDouble();

        if (n - (int) n == 0) {
            if (n > 0) {
                System.out.println((int) n + " is positive number");
            } else if (n == 0) {
                System.out.println("0 is zero number");
            } else {
                System.out.println((int) n + " is negative number");
            }
        } else {
            if ((int) n % 2 == 0) {
                System.out.println((int)n + " is even number");
            } else {
                System.out.println((int)n + " is odd number");
            }
        }

    }
}
