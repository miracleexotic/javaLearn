package w2;

import java.util.Scanner;
import java.util.Random;

public class MainClass {

    final static int MAX_AGE = 21;
    public static final Scanner in = new Scanner(System.in);
    public static final Random r = new Random();

    public static void main(String[] args) {
        // demo1();
        // demoRandom();
        // demoTenary();
        // gpaCal();
        // isVowel();
        // squareRoot();
        // sw.demo();
        // lab.l1();
        // lab.l2();
        // lab.l3();

    }

    public static void demo1() {
        System.out.print("Enter age : ");
        int age = in.nextInt();
        System.out.print("Enter gender : ");
        String sex = in.next();
        if (age <= MAX_AGE && sex.equalsIgnoreCase("mAlE")) {
            System.out.println("boy!!");
        }
        System.out.println("Thx.");
    }

    public static void isVowel() {
        System.out.print("Enter char : ");
        String c = in.next();
        if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o")
                || c.equalsIgnoreCase("u")) {
            System.out.println("vowel");
        } else {
            System.out.println("not vowel");
        }
    }

    public static void gpaCal() {
        System.out.print("Enter : ");
        int s = in.nextInt();
        if (s >= 70) {
            System.out.println("S");
        } else {
            System.out.println("U");
        }
        System.out.println("Thx.");
    }

    public static void demoRandom() {
        System.out.print("Enter : ");
        int num = in.nextInt();
        int rand = r.nextInt(10) + 1;
        if (num == rand) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(rand);
    }

    public static void demoTenary() {
        System.out.print("n1 = ");
        int n1 = in.nextInt();
        System.out.print("n2 = ");
        int n2 = in.nextInt();
        System.out.print("n3 = ");
        int n3 = in.nextInt();

        int max = n1 >= n2 ? (n1 >= n3 ? n1 : n3) : (n2 >= n3 ? n2 : n3);
        int min = n1 <= n2 ? (n1 <= n3 ? n1 : n3) : (n2 <= n3 ? n2 : n3);
        System.out.printf("%d %d %d", min, n1 + n2 + n3 - min - max, max);
    }

    public static void squareRoot() {
        System.out.print("Enter : ");
        double n = in.nextDouble();
        System.out.print("root : ");
        int r = in.nextInt();
        double ans = 0;
        if (r == 2 && n >= 0) {
            ans = Math.sqrt(n);
        } else if (r == 3 && n >= 0) {
            ans = Math.pow(n, (double) 1 / 3);
        }
        System.out.println(ans);
    }



}
