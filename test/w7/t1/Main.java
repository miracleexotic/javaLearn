/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Parent p1 = new Sub1();
        p1.message();
        
        Parent p2 = new Sub2();
        p2.message();

    }
}