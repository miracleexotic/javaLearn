import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>(); 
        arr.add("Hello");
        arr.add(1+1);
        System.out.println(arr);

        HashSet h = new HashSet(); // same set in math 
        h.add(2);
        h.add(4.2);
        h.add(2); // not use in set -> useless
        h.add(true);
        System.out.println(h);
        
        ArrayList a = new ArrayList(); // ArrayList contain HashSet
        a.addAll(h);
        System.out.println(a);

        TreeSet t = new TreeSet(); // sort data
        t.add(4);
        t.add(3);
        t.add(1);
        t.add(4); // useless
        t.add(2);
        System.out.println(t);

        HashMap hm = new HashMap(); // Map data with (key = value)
        hm.put("ID", "B6225605");
        hm.put("Name", "Mai Mai");
        System.out.println(hm);
    }
}