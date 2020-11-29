import jdk.jshell.execution.Util;

public class Main {
    
    public static void main(String[] args) {
        // static method
        // pow -> static method
        System.out.println(Math.pow(2.0, 10.0));
        System.out.println(Utils.capitalizedFisrtChar("bangKOK"));
        // Utils u = new Utils();
        // System.out.println(u.capitalizedFisrtChar("thailAND"));
        System.out.println(Utils.removeAllNonNumber("AB192-132.75"));
        System.out.println(Utils.vatRate);

    }

}
