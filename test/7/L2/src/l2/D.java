package l2;

public class D extends B implements A,F {
    public D() {
        System.out.println("Constructor of D.");
    }
    
    public void doA() {
        System.out.println("D is doing A.");
    }
    
    public void doF() {
        System.out.println("D is doing F.");
    }
}
