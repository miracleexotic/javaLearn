package oot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        exc05();
        exc06();

    }
    
    public static void exc05() {
        int[] n = {1, 2, 3};
        String s = "Hello";
        String s2 = null;

        try {
            process1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void process1() throws Exception {
        System.out.println("Do process1...");
        process2();
    }

    public static void process2() throws Exception {
        throw new Exception("Exception Found");
    }
    
    public static void exc06() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your student id: ");
        String id = scanner.nextLine();
        System.out.print("Enter you name: ");
        String name = scanner.nextLine();
        scanner.close();
        
        checkID(id);
        checkName(name);
        
    }
    
    public static void checkID(String id) {
        try {
            if(id.length() != 8) {
                throw new StudentIDFormatException("Id length is not 7");
            }
            for (int i = 0; i < id.length(); i++) {
                if(i == 0 && !Character.isLetter(id.charAt(i))) {
                    throw new StudentIDFormatException("Id format not start with Letter");
                } else if(i != 0 && !Character.isDigit(id.charAt(i))) {
                    throw new StudentIDFormatException("Id number format is not correct");
                }
            }
        }
        catch (StudentIDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    
public static void checkName(String name) {
    String[] temp = name.split(" ");
    
    try {
        if(!name.contains(" ")) {
            throw new StudentNameFormatException("Name format can't separate");
        }
        for (String str : temp) {
            for(int i = 0; i<str.length(); i++) {
                if(!Character.isLetter(str.charAt(i))) {
                    throw new StudentNameFormatException("Name format have number");
                }   
            }
        }
    }
    catch (StudentNameFormatException e) {
        System.out.println(e.getMessage());
    }
}
}


