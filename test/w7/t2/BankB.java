public class BankB extends Bank {
    public BankB(String name, int deposite) {
        super(name, deposite);
    }

    public int getBalance() {
        return super.getDeposite();
    }
}
