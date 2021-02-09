package oot.lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        String mode = "1";
        
        while(!mode.equals("0")) {
            System.out.println("Selected Mode");
            System.out.println("1: Add Student");
            System.out.println("2: Show all Student");
            System.out.println("0: Exit");
            System.out.print("Your Select: ");
            mode = scanner.nextLine();
            
            switch(Integer.parseInt(mode)) {
                case 1: arr.add(createStudent()); break;
                case 2: getAllStudent(arr); break;
                case 0: System.out.println("Bye"); break;
                default: System.out.println("Try Again");
            }
        }
        scanner.close();
    }
    
    public static Student createStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Firstname: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Student Lastname: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Student Major: ");
        String major = scanner.nextLine();
        
        return new Student(id, firstName, lastName, major);
    }
    
    public static void getAllStudent(ArrayList<Student> arr) {
        System.out.println("You have "+arr.size()+" student");
        for(Student student : arr) {
            student.getDetail();
        }
    }
    
}
