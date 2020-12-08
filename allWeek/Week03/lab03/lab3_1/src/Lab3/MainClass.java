package Lab3;
import java.util.Random;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] arr1 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = rand.nextInt(30) + 1; // 1
        }
        System.out.println("The array is ");
        for (int a : arr1) { // 2
            System.out.print(a + " ");
        }
        System.out.print("\nThe even numbers are ");
        for (int i = 0; i < 10; i++) { // 3
            if ((arr1[i] % 2 == 0)) { // 4
                System.out.print(arr1[i] + " ");
            }
        }
        
        /*
        float[] f = new float[3];
        float[][] ff = new float[3][3];
        */
        
        /*
        while(...) {
            ...
        }
        
        do {
            ...
        } while (...);
        */
        
        /*
        arr2[2] = arr1[4];
        */
        
        /*
        arr1.length;
        */
        
        /*
        a[1][3] = 0, a[3][0] = 94, a[7] = {92, 66, 89, 0}
        */
        
        
        
    }
}
