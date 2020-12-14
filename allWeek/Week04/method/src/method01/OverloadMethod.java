package method01;

public class OverloadMethod {
    public static void printOver() {
        System.out.println("No parameter!!");
    }
    
    public static void printOver(int n) {
        System.out.println("1 parameter (int) = " + n);
    }
    
    public static void printOver(char c) {
        System.out.println("1 parameter (char) = " + c);
    }
    
    public static void printOver(String str) {
        System.out.println("1 parameter (int) = " + str);
    }

    public static void printOver(String str, int n) {
        System.out.println("2 parameter (String) = " + str + ", (int) = " + n);
    }
    
    public void printOver(String str, int x, int y) {
        System.out.println("3 parameter (String) = " + str + ", (int) = " + x +
                ", (int) = " + y);
    }
    
}
