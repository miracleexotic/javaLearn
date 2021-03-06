package l2;

public class MainClass {

    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        E e = new E();
        
        doAProcess(c);
        doAProcess(d);
        
        doFProcess(d);
        doFProcess(e);
    }
    public static void doAProcess(A a) {
        a.doA();
    }
    
    public static void doFProcess(F f) {
        f.doF();
    }
}
