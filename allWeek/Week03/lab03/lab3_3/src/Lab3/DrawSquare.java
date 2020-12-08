package Lab3;

import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        String [][] arr = new String[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num-1 || j == 0 || j == num-1) {
                    arr[i][j] = "X ";
                    System.out.print(arr[i][j]);
                } else if (i == j) {
                    arr[i][j] = "X ";
                    System.out.print(arr[i][j]);
                } else if (i+j == num-1) {
                    arr[i][j] = "X ";
                    System.out.print(arr[i][j]);
                } else {
                    arr[i][j] = "  ";
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
        

    }

}
