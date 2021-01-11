package w3;

import java.util.Scanner;
import java.util.Random;

public class lab {

    private static final Scanner in = new Scanner(System.in);
    private static final Random r = new Random();

    public static void l1() {
        int[] arr = new int[10];
        for(int i = 0; i<10; i++) {
            arr[i] = r.nextInt(30) + 1; 
        }
        System.out.print("The arr is : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\nThe even num : ");
        for (int i = 0; i<10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("\n-------------\n");
    }

    public static void l2() {
        System.out.println("Enter a num student : ");
        int num = in.nextInt();
        int[] s = new int[num];
        int total = 0, count = 0;
        while (count < num) {
            System.out.print("Enter score : ");
            s[count] = in.nextInt();
            total += s[count] <= 100 && s[count] >= 0 ? s[count] : 0;
            System.out.print(s[count] <= 100 && s[count] >= 0 ? "" : "Please 0-100\n");
            count += s[count] <= 100 && s[count] >= 0 ? 1 : 0;
        }
        double avg = (double) total / count;
        System.out.printf("avg : %.1f", avg);
        System.out.print("\n-------------\n");
    }

    public static void l3() {
        System.out.print("Enter draw : ");
        int n = in.nextInt();
        String[][] arr = new String[n][n];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == n-1) {
                    arr[i][j] = "X ";
                    System.out.print(arr[i][j]);
                } else if (i == j) {
                    arr[i][j] = "X ";
                    System.out.print(arr[i][j]);
                } else if (i+j == n-1) {
                    arr[i][j] = "X ";
                    System.out.print(arr[i][j]);
                } else {
                    arr[i][j] = "  ";
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
        System.out.print("\n-------------\n");
    }
}
