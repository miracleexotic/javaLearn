public class BankC extends Bank {
    public BankC(String name, int deposite) {
        super(name, deposite);
    }

    public int getBalance() {
        return super.getDeposite();
    }
}
