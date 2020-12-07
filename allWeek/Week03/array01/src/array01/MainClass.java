package array01;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
//        demo04();
//        ex01();
//        ex02();
        exe01();

    }

    public static void demo01() {
        /*
        int[] score1 = new int[]{1,2,3};
        int[] score2 = {1,2,3};
        
        int[] score3 = new int[3];
        
        int[] score4;
        score4 = new int[]{1,2,3};
         */

        int[] score1 = new int[]{10, 20, 30, 40, 50};
        int size = score1.length;  // not ()
        System.out.println(size);

        // Reference
        int sum = score1[0] + score1[1];
        System.out.println(sum);

        // Assign
        System.out.println("Before: " + score1[2]);
        score1[2] = 60;
        System.out.println("After: " + score1[2]);

    }

    public static void demo02() {
        int[] a = new int[]{10, 20, 30, 40, 50};
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        System.out.println(total);
        System.out.println(a[a.length - 1]);
    }

    public static void demo03() {
        int[] a = new int[]{10, 20, 30, 40, 50};

        for (int item : a) {  // Java 8 -> foreach
            System.out.println(item);
        }
    }

    public static void demo04() {
        int[] a = new int[]{10, 20, 30, 40, 50};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void ex01() {
        int[] arr = new int[]{1, 2, 3};
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("After: " + Arrays.toString(arr));
    }

    public static void ex02() {
        int[][] table = new int[5][10];
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = row * 10 + col;
                System.out.print(table[row][col] < 10 && table[row][col] >= 0
                        ? "0" + table[row][col] + "\t" : table[row][col] + "\t");
            }
            System.out.println();
        }

    }

    public static void exe01() {
        int[][] values = new int[][]{{10, 20, 30},
                                     {40, 50, 60},
                                     {70, 80, 90}};
        
        for (int[] value : values) {
            int total = 0;
            for (int item : value) {
                total += item;
            }
            System.out.println(total);
        }
        
    }

}
