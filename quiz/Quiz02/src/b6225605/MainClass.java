package b6225605;

import java.util.Arrays;

/**
 *
 * @author B6225605 นายณัฐวัตร บุญโสดากร
 */
public class MainClass {

    public static void main(String[] args) {

        int[] num = new int[]{2, 5, 6, 3, 1, 4, 2, 9, 3, 7, 2, 2, 3};
        int[] unique = Arrays.stream(num).distinct().toArray();

        for (int item : unique) {
            int count = 0;
            for (int n : num) {
                if (item == n) {
                    count++;
                }
                if (count > 1) {
                    System.out.println("Duplicate Element : " + item);
                    break;
                }
            }
        }

    }

}
