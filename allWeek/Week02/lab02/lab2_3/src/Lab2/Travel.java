package Lab2;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {
        
        int total = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Do you go to Japan? ");
        String japan = sc.next();
        if (japan.equalsIgnoreCase("yes")) {
            System.out.print("Where do you go? ");
            String japanG = sc.next();
            total += (japanG.equalsIgnoreCase("tokyo")) ? 20 : 
                (japanG.equalsIgnoreCase("Hokkaido")) ? 50 :
                (japanG.equalsIgnoreCase("kyoto")) ? 40 : 0;
        } else if (japan.equalsIgnoreCase("no")) {
            total += 0;
        }
        
        System.out.print("Do you go to English? ");
        String eng = sc.next();
        if(eng.equalsIgnoreCase("yes")) {
            System.out.print("Where do you go? ");
            String engG = sc.next();
            total += (engG.equalsIgnoreCase("london")) ? 10 : 
                (engG.equalsIgnoreCase("greenwich")) ? 15 : 0;
        } else if (eng.equalsIgnoreCase("no")) {
            total += 0;
        }
        
        System.out.print("Do you go to USA? ");
        String usa = sc.next();
        if (usa.equalsIgnoreCase("yes")) {
            System.out.print("Where do you go? ");
            String usaG = sc.next();
            total += (usaG.equalsIgnoreCase("newyork")) ? 35 : 
                (usaG.equalsIgnoreCase("miami")) ? 10 : 0;
        } else if (eng.equalsIgnoreCase("no")) {
            ;  // same pass in python
        }
        
        System.out.println("Total distance is " + total);
    }
    
}
