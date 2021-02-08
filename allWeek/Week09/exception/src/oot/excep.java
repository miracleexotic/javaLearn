package oot;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excep {

//    public static void main(String[] args) {
////        - ArrayIndexOutOfBoundsException -
////        int[] number = {1, 2, 3};  
////        System.out.println(number[4]);
////        System.out.println("Bye");
////           
////        - StringIndexOutOfBoundException -
////        String string = "Hello";
////        System.out.println(string.charAt(7));
////        System.out.println("Bye");
////
////        - NullPointerException - 
////        String text = null;
////        System.out.println(text.length());
////        System.out.println("Bye");
////
////        - NumberFormatException - 
////        String text = "12Y";
////        System.out.println(Integer.parseInt(text));
////        System.out.println("Bye");
////        
////        exc01();
////        exc02();
////        exc03();
//        
//        
//        
//    }
    
    public static void exc01() {
        int[] x = {1, 2, 3};
        try {
            System.out.println(x[5]);
            System.out.println("Hello");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException founded");
        }

        try {
            System.out.println(x[0] / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException founded");
        }
    }
    
    public static void exc02() {
        // B6225605 นายณัฐวัตร บุญโสดากร
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Number 1: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Number 2: ");
            int num2 = scanner.nextInt();
            scanner.close();
            System.out.println("Result " + num1 + " / " + num2 + " = " + num1/num2);
        }
        catch (InputMismatchException e) {
            System.out.println("Input need only digit number.");
        }
        catch (ArithmeticException e) {
            System.out.println("Number 2 can't be zero");
        }
        System.out.println("Bye");
    }
    
    public static void exc03() {
        // B6225605 นายณัฐวัตร บุญโสดากร
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Number 1: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Number 2: ");
            int num2 = scanner.nextInt();
            scanner.close();
            System.out.println("Result " + num1 + " / " + num2 + " = " + num1/num2);
        }
        catch (InputMismatchException e) {
            System.out.println("Input need only digit number.");
        }
        catch (ArithmeticException e) {
            System.out.println("Number 2 can't be zero");
        }
        finally {
            System.out.println("Thank you");
        }
        System.out.println("Bye");
    }
    
    public static void exc04() {
        try {
            throw new ArithmeticException("Arithmetic Found"); // make Exception with throw
        }
        catch (ArithmeticException e) {
//            System.out.println("Exception founded");
            System.out.println(e.getMessage());
        }
    }

}
