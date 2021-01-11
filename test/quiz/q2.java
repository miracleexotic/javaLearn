package quiz;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 6, 3, 1, 4, 2, 9, 3, 7, 2, 2, 3 };
        int[] u = Arrays.stream(a).distinct().toArray();
        int[] lookup = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i : u) {
            int count = 0;
            for(int n : a) {
                if(i == n) {
                    count++;
                }
                if(count > 1) {
                    System.out.println("duplicate Element : " + i);
                    break;
                }
            }
        }
        System.out.print("\n-------------\n");
        for (int i : a) {
            lookup[i] += 1;
        }
        System.out.println(Arrays.toString(lookup));
        for (int i = 0; i<10; i++) {
            if(lookup[i] != 1 && lookup[i] != 0) {
                System.out.println("duplicate Element : " + i);
            }
        }
        
    }
}
