package lab2;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        
        String symbol = (num < 0) ? "ลบ " : "บวก ";
        String numString = (num == 0) ? "ศูนย์" :
                (num == 1 || num == -1) ? "หนึ่ง" :
                (num == 2 || num == -2) ? "สอง" :
                (num == 3 || num == -3) ? "สาม" :
                (num == 4 || num == -4) ? "สี่" :
                (num == 5 || num == -5) ? "ห้า" :
                (num == 6 || num == -6) ? "หก" :
                (num == 7 || num == -7) ? "เจ็ด" :
                (num == 8 || num == -8) ? "แปด" : "เก้า";
        System.out.println((num == 0) ? numString : symbol + numString);
        
    }
    
}
