package l2;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input from Keyboard: ");
        String str = scanner.nextLine();
        scanner.close();
        
        findLetter(str);
        findDigit(str);
    }
    
    public static void findLetter(String str) {
        str = str.toUpperCase();
        int[] c = new int[26];
        for(int i = 0; i<str.length(); i++) {
            char s = str.charAt(i);
            if(Character.isLetter(s)) {
                c[s-'A']++;
            }
        }
        System.out.println("=== Letter ===");
        for(int i = 0; i<26; i++) {
            if(c[i] != 0) {
                System.out.printf("%c = %d\n", i+'A', c[i]);
            }
        }
        System.out.println();
    }
    
    public static void findDigit(String str) {
        str = str.toUpperCase();
        int sum = 0;
        int[] c = new int[10];
        for(int i = 0; i<str.length(); i++) {
            char s = str.charAt(i);
            if(Character.isDigit(s)) {
                c[s-'0']++;
                sum += s-'0';
            }
        }
        System.out.println("=== Digit ===");
        for(int i = 0; i<10; i++) {
            if(c[i] != 0) {
                System.out.printf("%c = %d\n", i+'0', c[i]);
            }
        }
        System.out.println("Sum = " + sum);
    }
    
    
}


// AE2xrxD399HbcD@#$

