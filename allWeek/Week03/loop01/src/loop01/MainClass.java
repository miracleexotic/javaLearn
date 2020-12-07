package loop01;

import java.util.Scanner;

public class MainClass {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        demoWhile01();
//        ex01();
//        ex01WithInfinity();
//        exe01();
//        demoDoWhile01();
//        ex02();
//        exe02();
//        sumToNumber();
//        demoFor01();
//        ex03();
        exe03();

    }

    public static void demoWhile01() {
        int num = 5;
        int count = 1;
        while (count <= num) {
            System.out.println(count + " ");
            count++;
        }
    }

    public static void ex01() {
        System.out.print("Input number(0 to quit): ");
        int num = in.nextInt();
        int total = 0, count = 0;
        total += num;
        System.out.println("The sum so far is " + total);
        while (num != 0) {
            System.out.print("Input number(0 to quit): ");
            num = in.nextInt();
            total += num;
            System.out.println(num == 0 ? "" : "The sum so far is " + total);
            count++;
        }

        double avg = (double) total / count;
        System.out.printf("avg = %.3f\n", avg);

    }

    public static void ex01WithInfinity() {
        System.out.print("Input number(0 to quit): ");
        int num = in.nextInt();
        int total = 0, count = 1;
        total += num;
        System.out.println("The sum so far is " + total);
        while (true) {
            System.out.print("Input number(0 to quit): ");
            num = in.nextInt();
            if (num == 0) {
                break;
            } else {
                total += num;
                System.out.println("The sum so far is " + total);
                count++;
            }
        }

        double avg = (double) total / count;
        System.out.printf("avg = %.3f\n", avg);

    }

    public static void exe01() {
        System.out.print("Input number: ");
        int num = in.nextInt();
        int total = 0;
        total += num < 0 ? 0 : num;
        while (num > 0) {
            System.out.print("Input number: ");
            num = in.nextInt();
            total += num < 0 ? 0 : num;
        }
        System.out.println("The total sum is " + total);
    }

    public static void demoDoWhile01() {
        int num = 5;
        int count = 0;
        do {
            count++;
            System.out.println(count);
        } while (count < num);
    }

    public static void ex02() {
        int lastDigit, rev = 0;
        System.out.print("Input number: ");
        int num = in.nextInt();
        do {
            lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        } while (num > 0);
        System.out.println("rev = " + rev);
    }

    public static void exe02() {
        String ans;
        do {
            System.out.print("Input number 1 : ");
            int num1 = in.nextInt();
            System.out.print("Input number 2 : ");
            int num2 = in.nextInt();
            System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
            System.out.print("again?(y/n) : ");
            ans = in.next();
        } while (ans.equalsIgnoreCase("y"));
    }

    public static void sumToNumber() {
        System.out.print("Input number : ");
        int num = in.nextInt();
        int count = 1, total = 0;
        while (count <= num) {
            total += count;
            System.out.print(count == num ? count + " = " + total + "\n" : count + " + ");
            count++;
        }
    }

    public static void demoFor01() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void ex03() {
        System.out.print("Input number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exe03() {
        System.out.print("Input number: ");
        int num = in.nextInt();
        int fac = 1;
        System.out.print(num + "! = ");
        for (int i = num; i >= 1; i--) {
            fac *= i;
            System.out.print(i == 1 ? i + " = " + fac + "\n" : i + " x ");
        }
    }

}
