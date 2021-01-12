package oot.lab6;

public class Koo {
    public Koo() {
        System.out.println("Koo constructor");
    }
    
    public void process() {
        System.out.println("Koo doing");
    }
    
    public void calculate(int n) {
        for(int i = 0; i<n; i++) {
            for(int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for(int j = n-i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
