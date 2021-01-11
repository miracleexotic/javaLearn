package w2;

import java.util.Scanner;

public class sw {

    public static void demo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter : ");
        double n = in.nextDouble();
        System.out.print("root : ");
        int r = in.nextInt();
        double ans = 0;
        switch (r) {
            case 2:
                ans = Math.sqrt(n);
                break;
            case 3:
                ans = Math.pow(n, (double) 1 / 3);
                break;
            default :
                System.out.println("unknow");
        }
        System.out.println(ans);
    }

}
