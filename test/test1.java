/**
 * test1
 */

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = in.nextInt();
        double sum = sumSequace(num); // 1
        System.out.println("The sum of sequace is " + sum);

    }

    public static double sumSequace(int n) { // 2
        double total = 0;
        for (int i = 1; i <= n; i++) { // 3
            total += (double) 1/i; // 4
        }
        return total;
    }

}













