package w3;

import java.util.Scanner;

public class loop {

    private static Scanner in = new Scanner(System.in);

    public static void demoWhile01() {
        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("------------");
    }

    public static void ex01() {
        System.out.print("Enter (0 exit) : ");
        int num = in.nextInt();
        int total = num, count = 0;
        System.out.println("sum : " + total);
        while (num != 0) {
            System.out.print("Enter (0 exit) : ");
            num = in.nextInt();
            total += num;
            System.out.println(num == 0 ? "" : "sum : " + total);
            count++;
        }
        double avg = (double) total / count;
        System.out.printf("avg = %.3f\n", avg);
        System.out.println("------------");
    }

    public static void ex01WithInfinity() {
        System.out.print("Enter (0 exit) : ");
        int num = in.nextInt();
        int total = num, count = 1;
        System.out.println("sum : " + total);
        while (true) {
            System.out.print("Enter (0 exit) : ");
            num = in.nextInt();
            if (num != 0) {
                total += num;
                System.out.println("sum : " + total);
                count++;
            } else {
                break;
            }

        }
        double avg = (double) total / count;
        System.out.printf("avg = %.3f\n", avg);
        System.out.println("------------");
    }

    public static void exe01() {
        System.out.print("Enter : ");
        int n = in.nextInt();
        int total = 0;
        total += n > 0 ? n : 0;
        while (n > 0) {
            System.out.print("Enter : ");
            n = in.nextInt();
            total += n > 0 ? n : 0;
        }
        System.out.println("sum : " + total);
        System.out.println("------------");
    }

    public static void demoDoWhile01() {
        int count = 0;
        do {
            count++;
            System.out.println(count);
        } while (count <= 5);
        System.out.println("------------");
    }

    public static void ex02() {
        System.out.print("Enter for rev : ");
        int n = in.nextInt();
        int rev = 0;
        do {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        } while (n > 0);
        System.out.println("rev = " + rev);
        System.out.println("------------");
    }

    public static void exe02() {
        String ans;
        do {
            System.out.print("n1 = ");
            int n1 = in.nextInt();
            System.out.print("n2 = ");
            int n2 = in.nextInt();
            System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
            System.out.print("again? (y) > ");
            ans = in.next();
        } while (ans.equalsIgnoreCase("y"));
        System.out.println("------------");
    }

    public static void sumToNumber() {
        System.out.print("Enter to num : ");
        int n = in.nextInt();
        int count = 1, total = 0;
        while (count <= n) {
            total += count;
            System.out.print(count == n ? count + " = " + total + "\n" : count + " + ");
            count++;
        }
        System.out.println("------------");
    }

    public static void demoFor01() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");
    }

    public static void ex03() {
        System.out.print("Enter to draw: ");
        int n = in.nextInt();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    public static void exe03() {
        System.out.print("Enter fac : ");
        int n = in.nextInt();
        int fac = 1;
        for(int i = n; i>0; i--) {
            fac *= i;
            System.out.print(i == 1 ? i + " = " + fac : i + " x ");
        }
        System.out.println("\n------------");
    }

}
