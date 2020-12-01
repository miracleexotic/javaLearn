package lab2;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency:");
        String cur = sc.next(); // 1
        double total = 0;
        if (cur.equalsIgnoreCase("USD")) {  // 2
            System.out.println("How much?:");
            float amount = sc.nextFloat(); // 3
            total = amount * 30;
        } else if (cur.equalsIgnoreCase("JPY")) { // 4
            System.out.println("How much?:");
            float amount = sc.nextFloat(); // 5
            total = amount * 0.3;
        } else {
            System.out.println("Please choose the proper currency");
        }
        System.out.println("You earn " + total + " THB"); // 6

//        int month = 10;
//        String season = "";
//        if (month < 4) {
//            season = "Summer";
//        } else {
//            if (month < 9) {
//                season = "Raining";
//            } else {
//                season = "Winter";
//            }
//        }
//        System.out.println(season);
        
        

    }

}
