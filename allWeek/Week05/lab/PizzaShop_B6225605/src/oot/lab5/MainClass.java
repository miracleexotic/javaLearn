package oot.lab5;

import java.util.Scanner;

public class MainClass {
    
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Pizza Shop");
        System.out.print("Name your Pizza: ");
        String name = in.next();
        Pizza p = new Pizza(name); 
        System.out.println();
        
        Base b1 = new Base("Thickly", 300);
        Base b2 = new Base("Thinly", 200);
        System.out.println("Please select your base\n1. Thickly\n2. Thinly");
        System.out.print("> ");
        int base = in.nextInt();
        p.setBase(base == 1 ? b1 : b2);
        System.out.println();
        
        Topping t1 = new Topping("Peperoni", 150);
        Topping t2 = new Topping("Cheesy", 100);
        System.out.println("Please select your topping\n1. Peperoni\n2. Cheesy");
        System.out.print("> ");
        int top = in.nextInt();
        p.setTopping(top == 1 ? t1 : t2);
        System.out.println();
        
        System.out.print("Discount: ");
        double dis = in.nextDouble();
        p.discounting(dis);
        System.out.println();
        
        p.summary();
    }
    
}
