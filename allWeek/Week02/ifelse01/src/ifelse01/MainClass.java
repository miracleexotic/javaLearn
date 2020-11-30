package ifelse01;

import java.util.Scanner;
import java.util.Random;

public class MainClass {

    final static int MAX_AGE = 21; // static for use with class
    public static Scanner in = new Scanner(System.in);
    public static Random R = new Random();

    public static void main(String[] args) {

//        demo1();
//        isVowel();
//        gpaCal();
//        demoRandom();
//        demoTernary();
//        minValueCal();
//        gpaSubject();
//        squareRoot();
        SwitchCase.demo1();

    }

    public static void demo1() {
//        final int MAX_AGE = 21;
//        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter your gender: ");
        String gender = in.next();

        if (age < MAX_AGE && gender.equalsIgnoreCase("male")) {
            System.out.println("You\'re boy!!");
        }
        System.out.println("Thank you!!");

    }

    public static void isVowel() {
//        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String c = in.next();
        if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e")
                || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o")
                || c.equalsIgnoreCase("u")) {
            System.out.printf("%s is a vowel\n", c);
        } else {
            System.out.printf("%s isn\'t a vowel\n", c);
        }

    }

    public static void gpaCal() {
        System.out.print("Enter your score: ");
        int score = in.nextInt();

        if (score >= 70) {
            System.out.println("S");
        } else {
            System.out.println("U");
        }
        System.out.println("Thank you!!");

    }

    public static void demoRandom() {
        final int MAX = 10;
        System.out.print("Input num: ");
        int num = in.nextInt();

        int ans = R.nextInt(MAX) + 1; // 0-9 -> 1-10

        if (num == ans) {
            System.out.println("Correct!!");
        } else {
            System.out.println("Not Correct!! (" + ans + ")");
        }
    }

    public static void demoTernary() {
        System.out.print("Input score: ");
        int score = in.nextInt();

        char grade = (score >= 70 ? 'S' : 'U');
        System.out.println("Your grade is " + grade);

    }

    public static void minValueCal() {
        int num1, num2, num3, min = 0;
        System.out.print("Input 3 num(int): ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
            } else {
                min = num3;
            }
        } else if (num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        System.out.println("Minimum value: " + min);
    }

    public static void gpaSubject() {
        System.out.print("Enter ID: ");
        String id = in.next();
        System.out.print("Enter your score: ");
        int score = in.nextInt();

        if (id.equalsIgnoreCase("OOT")) {
            if (score >= 80) {
                System.out.println("A");
            } else if (score >= 75 && score <= 79) {
                System.out.println("B+");
            } else if (score >= 70 && score <= 74) {
                System.out.println("B");
            } else if (score >= 65 && score <= 69) {
                System.out.println("C+");
            } else if (score >= 60 && score <= 64) {
                System.out.println("C");
            } else if (score >= 55 && score <= 59) {
                System.out.println("D+");
            } else if (score >= 50 && score <= 54) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else if (id.equalsIgnoreCase("PJ")) {
            if (score >= 70) {
                System.out.println("S");
            } else {
                System.out.println("U");
            }
        }
        System.out.println("Thank you!!");

    }
    
    public static void squareRoot() {
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Input root: ");
        int root = in.nextInt();
        double ans = 0;
           
        if (num >= 0) {
            if (root == 2) {
                ans = Math.sqrt((double)num);
            } else if (root == 3) {
                ans = Math.pow((double)num, (double)1 / (double)3);
            }
        } else {
            System.out.println("Negative number is not allowed");
        }
        System.out.println(ans);
    }

}
