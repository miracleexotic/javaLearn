package lab4;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter optin: ");
        String s = in.next();
        char c = s.charAt(0);
        switch (c) {
            case 'A':
                drawRectangle(3);
                break;
            case 'B':
                drawTriangle(5);
                break;
            case 'C':
                drawRectangle(4, 8);
                break;
        }
    }

    public static void drawRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n*2; k++) {
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

    public static void drawRectangle(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

}
