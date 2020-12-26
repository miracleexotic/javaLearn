package quiz;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = in.nextDouble();

        if (num - (int) num != 0) {
            if ((int)num % 2 == 0) {
                System.out.println((int) num + " is even number");
            } else {
                System.out.println((int) num + " is odd number");
            }
        } else {
            if (num > 0) {
                System.out.println((int) num + " is positive number");
            } else if (num == 0) {
                System.out.println("0 is zero number");
            } else {
                System.out.println((int) num + " is negative number");
            }
        }

    }

}
