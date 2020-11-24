import java.lang.reflect.Array;
import java.util.Arrays;

public class arr02 {
    
    public static void demoSortNumber() {
        int[] n = {28, 32, 55, 9, 40}; 
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        // for(int i = 0; i<n.length; i++) {
        //     System.out.println(n[i]);
        // }
    }

    public static void demoSortString() {
        String[] coffees = {"Mocha", "Latte", "Espresso", "cappuccino"};
        System.out.println("---before---");
        System.out.println(Arrays.toString(coffees));

        System.out.println("---after---");
        // Arrays.sort(coffees);
        Arrays.sort(coffees, 0, coffees.length, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(coffees));
    }

    public static void main(String[] args) {
        demoSortString();
    }

}
