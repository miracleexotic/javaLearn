public class Main {
    public static void main(String[] args) {
        Bank a = new BankA("A", 100);
        balance(a);

        Bank b = new BankA("B", 150);
        balance(b);
        
        Bank c = new BankA("C", 200);
        balance(c);

    }

    public static void balance(Bank bank) {
        System.out.println(bank.getName() + " = " + bank.getBalance());
    }
}
