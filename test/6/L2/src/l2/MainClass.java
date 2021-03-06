package l2;

public class MainClass {

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
    
    public static void doProcess(Poo obj, int n) {
        obj.calculate(n);
    }
    
}




