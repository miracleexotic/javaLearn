package oot.lab7;

public class D extends B implements A, F{
    public D() {
        super();
        System.out.println("Constructor of D.");
    }
    
    public void doA() {
        System.out.println("D is doing A.");
    }
    
    public void doF() {
        System.out.println("D is doing F.");
    }
}
