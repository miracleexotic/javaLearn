import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter option: ");
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
                System.out.print("O ");
            }
            System.out.print(i == n-1 ? "" : "\n");
        }
    }

    public static void drawTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("O ");
            }
            System.out.print(i == n ? "" : "\n");
        }
    }

    public static void drawRectangle(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("O ");
            }
            System.out.print(i == x-1 ? "" : "\n");
        }
    }

}
