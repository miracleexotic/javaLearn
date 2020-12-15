package lab4;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = sc.nextInt();
        double sum = sumNumber(num); // 1
        System.out.println("The sum of sequace is " + sum);
    }
    
    public static double sumNumber(int n) {  //2
        double total = 0;
        for (int i = 1; i<=n; i++) {  // 3
            total += (double) 1/i;  // 4
        }
        return total;
    }
    
}
