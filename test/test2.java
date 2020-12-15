import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        double money = 1000;
        int amt_income = 0;
        int amt_expense = 0;
        String opt;
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Option: ");
            opt = sc.next();
            if (opt.equalsIgnoreCase("o")) {
                showMoney(amt_income, amt_expense, money);
                break;
            }
            System.out.print("List of expense: ");
            String str = in.next();
            System.out.print("Amount of Expense: ");
            int amt = sc.nextInt();
            if (opt.equalsIgnoreCase("+")) {
                amt_income += amt;
            } else {
                amt_expense += amt;
            }
        } while (!(opt.equalsIgnoreCase("o")));
    }

    public static void showMoney(int amt_income, int amt_expense, double money) {
        System.out.println("Amount of income = " + (double)amt_income);
        System.out.println("Amount of expense = " + (double)amt_expense);
        System.out.println("Now, You have " + (money+amt_income-amt_expense) + " bath.");
    }

}
