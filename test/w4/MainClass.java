package w4;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // ex02();
        // ex01();
        // demo01();
        // demo02();
        // getMonName(7);
        // System.out.println(getAbsVal(-2));

        // lab.l1();
        // lab.l2();
        // lab.l3();
    }

    public static void ex02() {
        int count = 0;
        String[] s = new String[3];
        do {
            System.out.print("s["+count+"] = ");
            s[count] = in.next();
            if(s[count].length() < 5) {
                count++;
            } else {
                System.out.println("Plaese 0-4");
            }
        } while (count < 3);
        char[] c = getChar3(s);
        System.out.println(Arrays.toString(c));
    }
    
    public static char[] getChar3(String[] s) {
        char[] c = new char[s.length];
        for(int i = 0; i<s.length; i++) {
            c[i] = s[i].charAt(s[i].length() - 1);
        }
        return c;
    }

    public static void ex01() {
        int[] a = new int[]{150,200,300};
        System.out.print("count(TH/...) : ");
        String c = in.next();
        System.out.println(getTotal(a, c));
    }

    public static double getTotal(int[] a, String c) {
        if(c.equalsIgnoreCase("TH")) {
            return calTax(sumNumber(a), 7);
        } else {
            return calTax(sumNumber(a), 10.5);
        }
    }

    public static int  sumNumber(int[] a) {
        int total = 0;
        for(int i : a) {
            total += i;
        }
        return total;
    }

    public static double calTax(int a, int tax) {
        return a*(100+tax)/100;
    }
    
    public static double calTax(int a, double tax) {
        return a*(100+tax)/100;
    }

    public static int addNumber(int a, int b) {
       return a+b; 
    }

    public static void demo01() {
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.print("Input s : ");
        String msg = in.next();
        getChar(n, msg);

    }

    public static void getChar(int n, String msg) {
        System.out.println(msg.charAt(n));
    }

    public static void demo02() {
        System.out.print("s : ");
        String s = in.next();
        MainClass get = new MainClass();
        get.getChar2(s);
    }

    public void getChar2(String s) {
        for(int i = 0; i<s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void getMonName(int m) {
        String[] mon = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dem"};
        System.out.println(mon[m-1]);
    }

    public static int getAbsVal(int n) {
        return n < 0 ? -n : n;
    }

}