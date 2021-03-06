package l1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1,num2;
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {0,2,3,4,5};
        
        try {
            System.out.print("Enter num1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter num2: ");
            num2 = scanner.nextInt();
            scanner.close();
        
            System.out.println(arr1[num1] + " / " + arr2[num2] + " = " + arr1[num1]/ arr2[num2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured: " + e.toString());
            System.out.println("You entered number exceeds the array size");
        } catch (ArithmeticException e) {
            System.out.println("Exception occured: " + e.toString());
            System.out.println("Divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Exception occured: " + e.toString());
            System.out.println("You must specify an index in integer");
        }
    }
    
}
