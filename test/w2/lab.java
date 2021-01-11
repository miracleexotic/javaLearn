package w2;

import java.util.Scanner;

public class lab {

    private static final Scanner in = new Scanner(System.in);

    public static void l1() {
        System.out.print("Enter cur: ");
        String cur = in.next();
        double total = 0;
        if (cur.equalsIgnoreCase("USD")) {
            System.out.print("amount : ");
            float amount = in.nextFloat();
            total += amount * 30;
        } else if (cur.equalsIgnoreCase("JPY")) {
            System.out.print("amount : ");
            float amount = in.nextFloat();
            total += amount * 0.3;
        } else {
            System.out.println("Please choose the proper cur");
        }
        System.out.println(total + " THB");

    }

    public static void l2() {
        System.out.println("Enter : ");
        int n = in.nextInt();
        String symbol = n > 0 ? "บวก " : "ลบ ";
        String num = (n == 0) ? "ศูยน์"
                : (n == 1 || n == -1) ? "หนึ่ง"
                        : (n == 2 || n == -2) ? "สอง"
                                : (n == 3 || n == -3) ? "สาม"
                                        : (n == 4 || n == -4) ? "สี่"
                                                : (n == 5 || n == -5) ? "ห้า"
                                                        : (n == 6 || n == -6) ? "หก"
                                                                : (n == 7 || n == -7) ? "เจ็ด"
                                                                        : (n == 8 || n == -8) ? "แปด" : "เก้า";
        System.out.println(n == 0 ? num : symbol + num);
    }

    public static void l3() {
        int total = 0;
        
        System.out.print("Do you go to Japan? ");
        String japan = in.next();
        if (japan.equalsIgnoreCase("yes")) {
            System.out.print("Where do you go? ");
            String japanG = in.next();
            total += (japanG.equalsIgnoreCase("tokyo")) ? 20 : 
                (japanG.equalsIgnoreCase("Hokkaido")) ? 50 :
                (japanG.equalsIgnoreCase("kyoto")) ? 40 : 0;
        } else if (japan.equalsIgnoreCase("no")) {
            total += 0;
        }
        
        System.out.print("Do you go to English? ");
        String eng = in.next();
        if(eng.equalsIgnoreCase("yes")) {
            System.out.print("Where do you go? ");
            String engG = in.next();
            total += (engG.equalsIgnoreCase("london")) ? 10 : 
                (engG.equalsIgnoreCase("greenwich")) ? 15 : 0;
        } else if (eng.equalsIgnoreCase("no")) {
            total += 0;
        }
        
        System.out.print("Do you go to USA? ");
        String usa = in.next();
        if (usa.equalsIgnoreCase("yes")) {
            System.out.print("Where do you go? ");
            String usaG = in.next();
            total += (usaG.equalsIgnoreCase("newyork")) ? 35 : 
                (usaG.equalsIgnoreCase("miami")) ? 10 : 0;
        } else if (eng.equalsIgnoreCase("no")) {
            ;  // same pass in python
        }
        
        System.out.println("Total distance is " + total);
    }

}
