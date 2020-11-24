package Lab1_3;

import java.util.Scanner;

public class CalcuateDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 10000: ");
        int n = in.nextInt();
        int c = n;
//        int d1 = n/10000;
//        System.out.println(d1);
//        int d2 = n/1000%10;
//        System.out.println(d2);
//        int d3 = n/100%10;
//        System.out.println(d3);
//        int d4 = n/10%10;
//        System.out.println(d4);
//        int d5 = n%10;
//        System.out.println(d5);
        int sum = 0;
        while (n>0 && (n>=0 && n<=10000)) {
            sum += n%10;
            n /= 10;
        }
        System.out.println("The sum of all digits in " + c + " is " + sum);
        
    }
    
}
