package w4;

import java.util.Scanner;

public class lab {

    private static final Scanner in = new Scanner(System.in);
    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void l1() {
        System.out.print("n : ");
        int n = in.nextInt();
        System.out.println("sum 1/n : " + sumNumber(n));
    }

    public static double sumNumber(int n) {
        double total = 0;
        for (int i = 1; i <= n; i++) {
            total += (double) 1 / i;
        }
        return total;
    }

    public static void l2() {
        double money = 1000;
        int amt_in = 0;
        int amt_ex = 0;
        String opt;
        do {
            System.out.print("option : ");
            opt = in.next();
            if (opt.equalsIgnoreCase("+")) {
                System.out.print("list in: ");
                String s = sc.next();
                System.out.print("amt = ");
                amt_in += in.nextInt();
            } else if (opt.equalsIgnoreCase("-")) {
                System.out.print("list in: ");
                String s = sc.next();
                System.out.print("amt = ");
                amt_ex += in.nextInt();
            }
        } while (!(opt.equalsIgnoreCase("0")));
        System.out.println("in = " + (double) amt_in);
        System.out.println("ex = " + (double) amt_ex);
        System.out.println("total = " + summaryEx(amt_in, amt_ex, money));
    }

    public static double summaryEx(int in, int ex, double m) {
        return m + in - ex;
    }

    public static void l3() {
        System.out.print("draw : ");
        String d = in.next();
        char c = d.charAt(0);
        switch (c) {
            case 'A':
                drawRec(3);
                break;
            case 'B':
                drawTri(5);
                break;
            case 'C':
                drawRec(4, 8);
                break;
        }
    }

    public static void drawRec(int x) {
        for (int i = 0; i<x; i++) {
            for (int j = 0; j<x; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void drawRec(int x, int y) {
        for (int i = 0; i<x; i++) {
            for (int j = 0; j<y; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void drawTri(int n) {
        for(int i = 0; i<n; i++) {
            for(int k = 0; k<n*2; k++) {
                if (i == n-1 && k < n) {
                    System.out.print("x ");
                } else if ((k == n-1-i || k == n-1+i) && i != n-1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
