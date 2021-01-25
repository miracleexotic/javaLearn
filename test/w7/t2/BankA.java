public class BankA extends Bank {
    public BankA(String name, int deposite) {
        super(name, deposite);
    }

    public int getBalance() {
        return super.getDeposite();
    }
    
}
