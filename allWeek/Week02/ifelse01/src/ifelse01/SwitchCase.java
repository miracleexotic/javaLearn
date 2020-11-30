package ifelse01;

import java.util.Scanner;

public class SwitchCase {
    
    public static void demo1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Input root: ");
        int root = in.nextInt();
        double ans = 0;
           
        switch(root) {
            case 2:
                ans = Math.sqrt((double)num);
                break;
            case 3:
                ans = Math.pow((double)num, (double)1 / (double)3);
                break;
            default:
                System.out.println("Unknow");
        }
        System.out.println(ans);
        
    }
    
}
