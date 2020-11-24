public class whileloop01 {
    
    public static void demo() {
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }
    }

    public static void demo2() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
    }

    // start money 100 up 5% -> 200 how many years?
    // 100 * 1.05 = 105
    // 105 * 1.05 >= 200
    public static void saving() {
        float deposit = 100.0f;
        float rate = 0.05f;
        int years = 1;
        float balance = deposit * (1 + rate);
        while (balance <= 200.0f) {
            System.out.printf("end of year: %d balance = %.2f\n", years, balance);
            balance = balance * (1 + rate);
            years++;
        }
        System.out.printf("end of year: %d balance = %.2f", years, balance);
    }

    public static void main(String[] args) {
        saving();
    }

}
