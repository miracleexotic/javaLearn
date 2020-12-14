package method01;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(addNumber(1, 2));
//        demo01();  // static
//        demo02();  // non-static
//        <Overloading Method> |
//        printName();       <-|
//        printName("mai");  <-|
//        System.out.println(getPi());
//        String s = getStringConcate("SU", "T"); System.out.println(s);
//        System.out.println(getMonthName(12));
//        getMonthName02(12);
//        System.out.println(getAbsVal(-3));

//        OverloadMethod.printOver();
//        OverloadMethod.printOver(1);
//        OverloadMethod.printOver('M');
//        OverloadMethod.printOver("SUT");
//        OverloadMethod.printOver("SUT", 1);
//        OverloadMethod om = new OverloadMethod();  //  <-|  
//        om.printOver("SUT", 1, 1); // without static     |
//        ex01();
//        ex02();
        ex02Teach();

    }

    public static void ex02() {
        String[] str = new String[3];
        int count = 0;
        do {
            do {
                System.out.print("Str[" + count + "] = ");
                str[count] = in.next();
            } while (str[count].length() >= 5);
            count++;
        } while (count < 3);

        char[] c = getChar3(str);
        System.out.println(Arrays.toString(c));

    }

    public static char[] getChar3(String[] s) {
        char[] c = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            c[i] = s[i].charAt(s[i].length() - 1);
//            System.out.println(c[i]);
        }
        return c;
    }

    public static void ex02Teach() {
        String[] str = new String[3];
        int count = 0;
        do {
            System.out.print("Str[" + count + "] = ");
            str[count] = in.next();
            if (str[count].length() < 5) {
                count++;
            } else {
                System.out.println("Plase input new String(1-4)");
            }
        } while (count < 3);

        char[] c = getChar3(str);
        System.out.println(Arrays.toString(c));
    }

    public static void ex01() {
        int arr[] = new int[]{150, 200, 300};
        System.out.print("contry : ");
        String contry = in.next();
        System.out.println(getTotal(arr, contry));
    }

    public static double getTotal(int[] n, String str) {
        if (str.equalsIgnoreCase("TH")) {
            return calTax(sumNumber(n), 7);
        } else {
            return calTax(sumNumber(n), 10.5);
        }
    }

    public static double calTax(int pri, int tax) {
        return pri * (100 + tax) / 100;
    }

    public static double calTax(int pri, double tax) {
        return pri * (100 + tax) / 100;
    }

    public static int sumNumber(int[] n) {
        int total = 0;
        for (int item : n) {
            total += item;
        }
        return total;
    }

    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static void demo01() {
        System.out.print("Input num: ");
        int num = in.nextInt();
        System.out.print("Input String: ");
        String msg = in.next();
        getChar(num, msg);
        System.out.println("Done!!");
    }

    public static void getChar(int n, String str) { // with static
        char c = str.charAt(n);  // .charAt(indexOfString) -> value at index 
        System.out.println(c);
    }

    public static void demo02() {
        System.out.print("Input String: ");
        String msg = in.next();
        MainClass get = new MainClass();
        get.getChar2(msg);
        System.out.println("\nDone!!");
    }

    public void getChar2(String str) { // without static
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void printName() {
        System.out.println("Hello stranger!!");
    }

    public static void printName(String name) {
        System.out.println("Hello " + name + "!!");
    }

    public static double getPi() {
        return (double) 22 / 7;
    }

    public static String getStringConcate(String s1, String s2) {
        return s1 + s2;
    }

    public static String getMonthName(int n) {
        switch (n) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";

        }
        return "Out of Month";
    }

    public static void getMonthName02(int n) {
        String[] month = new String[]{"Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dem"};
        System.out.println(month[n - 1]);
    }

    public static int getAbsVal(int n) {
        return n < 0 ? -n : n;
    }

}
