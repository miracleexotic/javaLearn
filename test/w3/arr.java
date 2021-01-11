package w3;

import java.util.Arrays;

public class arr {

    public static void demo01() {
        int[] s = new int[] { 10, 20, 30, 40, 50 };
        int size = s.length;
        System.out.println(size);

        int sum = s[0] + s[1];
        System.out.println("sum : " + sum);

        System.out.println("before : " + s[3]);
        s[3] = 100;
        System.out.println("after : " + s[3]);
        System.out.println("\n--------------\n");
    }

    public static void demo02() {
        int[] a = new int[] { 10, 20, 30, 40, 50 };
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        System.out.println(total);
        System.out.println(a[a.length - 1]);
        System.out.println("\n--------------\n");
    }

    public static void demo03() {
        int[] s = new int[] { 10, 20, 30, 40, 50 };
        for (int item : s) {
            System.out.println(item);
        }
        System.out.println("\n--------------\n");
    }

    public static void demo04() {
        int[] s = new int[] { 10, 20, 30, 40, 50 };

        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        System.out.println("\n--------------\n");
    }

    public static void ex01() {
        int[] a = new int[] { 1, 2, 3 };
        System.out.println("before rev : " + Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println("after rev : " + Arrays.toString(a));
        System.out.println("\n--------------\n");
    }

    public static void ex02() {
        int[][] table = new int[5][10];
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = row * 10 + col;
                System.out.print(table[row][col] < 10 && table[row][col] >= 0 ? "0" + table[row][col] + "\t"
                        : table[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n--------------\n");
    }

    public static void exe01() {
        int[][] vals = new int[][] { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        for (int[] val : vals) {
            int total = 0;
            for (int item : val) {
                total += item;
            }
            System.out.println(total);
        }
        System.out.println("\n--------------\n");
    }

}
