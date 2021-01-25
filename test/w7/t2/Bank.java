public abstract class Bank {
    private int deposite;
    private String name;

    public Bank(String name, int deposite) {
        this.deposite = deposite;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDeposite() {
        return deposite;
    }

    public abstract int getBalance();
}
