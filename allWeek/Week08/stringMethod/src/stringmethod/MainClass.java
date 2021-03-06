package stringmethod;

import java.util.Scanner;

public class MainClass {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        char[] ch = {'H', 'e', 'l', 'l', 'o'};
//        
//        String str = new String(ch); 
//        System.out.println(str);
//        System.out.println(str.charAt(3));
//        
//        System.out.println((int)str.charAt(3));

//        findHLASCII();
//        string01();
        string02();
//        string03();
//        string04();
//        string05();
//        string06();
//        string07();
//        exe4();
//        string08();

    }

    public static void string08() {
        StringBuffer sb = new StringBuffer("ABC");
        System.out.println(sb);
        System.out.println(sb.length());
        String s;

        s = sb.toString();
        System.out.println(s);

        sb.append("XYZ");
        System.out.println(sb.toString());
        System.out.println(sb);
        System.out.println(sb.length());

        sb.insert(3, "MN");
        System.out.println(sb);
        System.out.println(sb.length());

        sb.delete(3, 5);
        System.out.println(sb);
        System.out.println(sb.length());

    }

    public static void exe4() {
        // B6225605 นายณัฐวัตร บุญโสดากร
        System.out.print("Input String: ");
        String str = in.next();
        int countDigit = 0;
        int countLetter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                countDigit++;
            } else if (Character.isLetter(str.charAt(i))) {
                countLetter++;
            }
        }
        System.out.println("Number of Letter: " + countLetter);
        System.out.println("Number of Digit: " + countDigit);
    }

    public static void string07() {
        String str = "AEx2-d2435AH99H";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }

    public static void string06() {
        String s1, s2, s3;
        s1 = "Hello";
        s2 = "Hello";
        s3 = "hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s2)); // 0 is equals
        System.out.println(s1.compareTo(s3)); // -32 = (H-h)
    }

    public static void string05() {
        String str = new String("Hello World 123546#$%");

        String[] arrOfStrings = str.split(" ", 2);

        for (String item : arrOfStrings) {
            System.out.println(item);
        }
    }

    public static void string04() {
        String str = new String("Hello World 123546#$%");

        int num = 0;
        while (num != -1) {
            num = str.indexOf('l');
            System.out.println("L was at " + num);
            str = str.substring(num + 1);
            System.out.println(str);
        }
    }

    public static void string03() {
        String str = new String("Hello World 123546#$%");
        String str2 = "Mai";

        System.out.println(str);
        System.out.println(str2);

        String str3 = str + " " + str2;
        System.out.println(str3);

        String str4 = (str.concat(" ")).concat(str2);
        System.out.println(str4);

    }

    public static void string02() {
        String str = new String("Hello World 123546#$%");
        System.out.println("Original: " + str);

        System.out.println(str.indexOf('l')); // .indexOf(char)
        System.out.println(str.indexOf("rld")); // get first index of r
        System.out.println(str.indexOf("all")); // -1 = not found
        System.out.println(str.lastIndexOf('l'));
    }

    public static void string01() {
        String str = new String("Hello World 123546#$%");
        System.out.println("Original: " + str);

        str = str.toUpperCase();
        System.out.println("Upper case: " + str);

        str = str.toLowerCase();
        System.out.println("Lower case: " + str);
    }

    public static void findHLASCII() {
        String str = "ABC#erabWXY$# ^/%ydh#%heFB";
        char maxChar = maxChar(str);
        char minChar = minChar(str);
        System.out.println(str.length());
        System.out.println("Max ASCII code value character is " + maxChar);
        System.out.println("Max ASCII code value character is " + minChar);
        System.out.println("Range from max to min is " + (maxChar - minChar));
    }

    public static char maxChar(String str) {
        char max = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            max = str.charAt(i) > max ? str.charAt(i) : max;
        }
        return max;
    }

    public static char minChar(String str) {
        char min = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            min = str.charAt(i) < min ? str.charAt(i) : min;
        }
        return min;
    }

}
