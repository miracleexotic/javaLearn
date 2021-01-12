package oot.lab6;

/**
 *
 * @author 
 */
public class Main {

    public static void main(String[] args) {
        Moo m = new Moo();
        Poo p = new Poo();
        Noo n = new Noo();
        
        new Koo().process();
        p.process();
        n.process();
        n.process("Hi!");
        
        doProcess(m, 4);
        doProcess(p, 6);
    }
    
    public static void doProcess(Poo k, int n) {
        k.calculate(n);
    }
    
}
