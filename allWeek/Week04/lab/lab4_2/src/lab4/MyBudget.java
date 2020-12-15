package lab4;

import java.util.Scanner;

public class MyBudget {

    public static final Scanner in = new Scanner(System.in);
    public static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        String opt;
        double money = 1000;
        int amt_income = 0;
        int amt_expense = 0;
        
        do {
            opt = getOpt();
            if (opt.equalsIgnoreCase("+")) {
                System.out.print("List of expense: ");
                String lst = sc.next();
                amt_income += getMoney();;
            } else if (opt.equalsIgnoreCase("-")){
                System.out.print("List of expense: ");
                String lst = sc.next();
                amt_expense += getMoney();;
            }
        } while (!(opt.equalsIgnoreCase("0")));
        System.out.println("Amount of income = " + (double)amt_income);
        System.out.println("Amount of expense = " + (double)amt_expense);
        System.out.println("Now, You have " + summaryExpense(amt_income, amt_expense,
                    money) + " bath.");
    }

    public static String getOpt() {
        System.out.print("Option: ");
        String opt = in.next();
        return opt;
    }

    public static int getMoney() {
        System.out.print("Amount of expense: ");
        int money = in.nextInt();
        return money;
    }

    public static double summaryExpense(int amt_income, int amt_expense, double money) {
        return money + amt_income - amt_expense;
    }
    
}
