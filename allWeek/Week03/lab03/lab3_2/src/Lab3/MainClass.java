package Lab3;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = in.nextInt();
        int[] score = new int[num];
        int total = 0;
        
        int count = 0;
        while (count < num) {
            System.out.print("Enter student score: ");
            score[count] = in.nextInt();
            total += score[count] <= 100 && score[count] >= 0 ? score[count] : 0;
            System.out.print(score[count] <= 100 && score[count] >= 0 ? "" : "Please enter the score 0-100\n");
            count += score[count] <= 100 && score[count] >= 0 ? 1 : 0; 
        }
        /*
        for (int a : score) {
            System.out.print(a + " ");
        }
        */
        double avg = (double) total / num;
        System.out.printf("The average score is %.1f\n", avg);
        
        
    }
    
}
