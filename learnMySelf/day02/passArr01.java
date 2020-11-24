import java.util.Arrays;

public class passArr01 {

    public static void demoT1(int[] x) {
        for(int i = 0; i<x.length; i++) {
            x[i] = x[i]*10;
        }
    }

    public static void t1() {
        int[] n = {2, 4, 6, 8};
        System.out.println(Arrays.toString(n));
        demoT1(n);
        System.out.println(Arrays.toString(n));
    }

    public static void demoT2(int x) {
        x = x * 10;
    }

    public static void t2() {
        int n = 10;
        demoT2(n);
        System.out.println(n);
    }

    public static void demoT3(String s) {
        s = "Spiderman";
    }

    public static void t3() {
        String name = "Peter Parker";
        demoT3(name);
        System.out.println(name);
    }

    public static void demoT4(String s[]) {
        s[0] = "Spiderman";
    }

    public static void t4() {
        String name[] = {"Peter Parker"};
        demoT4(name);
        System.out.println(name[0]);
    }

    public static void main(String[] args) {
        t4();
    }

}