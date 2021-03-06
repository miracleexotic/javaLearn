package l2;

public class C extends B implements A {
    public C() {
        System.out.println("Constructor of C.");
    }
    
    public void doA() {
        System.out.println("C is doing A.");
    }
}
