package oot.lab8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input from Keyboard: ");
        String str = scanner.nextLine();
        scanner.close();
        
        findLetter(str);
        findDigit(str);
    }
    
    public static void findLetter(String str) {
        System.out.println("=== Letter ===");
//        String original = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] c = new int[26];
        for (int i = 0; i < 26; i++) {
            c[i] = 0;
        }
        for (int i = 0; i<str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (Character.isUpperCase(str.charAt(i))) {
                    int push = (int)(str.charAt(i)) - (int)'A';
                    if (push >= 0 && push < 26) {
                        c[push]++;
                    }
                } else if (Character.isLowerCase(str.charAt(i))) {
                    int push = (int)(str.charAt(i)) - (int)'a';
                    if (push >= 0 && push < 26) {
                        c[push]++;
                    }
                }
            }
        }
        for (int i = 0; i<26; i++) {
            if (c[i] != 0) {
                System.out.println((char)('A'+i) + " = " + c[i]);
            }
        }
        System.out.println();
    }
    
    public static void findDigit(String str) {
        System.out.println("=== Digit ===");
        int total = 0;
        int[] c = new int[10];
        for (int i = 0; i < 10; i++) {
            c[i] = 0;
        }
        for (int i = 0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                c[str.charAt(i) - '0']++;
                total += str.charAt(i) - '0';
            }
        }
        for (int i = 0; i<10; i++) {
            if (c[i] != 0) {
                System.out.println(i + " = " + c[i]);
            }
        }
        System.out.println("Sum = " + total);
    }
    
}
