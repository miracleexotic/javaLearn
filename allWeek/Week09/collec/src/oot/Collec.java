package oot;

import java.util.*;

public class Collec {

    public static void main(String[] args) {
//        coll01();
//        coll02();
//        coll03();
//        coll04();
//        coll05();
//        coll06();
        // coll07();
        ArrayList<Student> arr = new ArrayList<>(); 
        arr.add(new Student());
        arr.add(new Student());
        System.out.println(arr);
    }
    
    public static void coll01() { // Boxing and Unboxing
        int x = 5;
        
        // Boxing
        Integer y;
        y = Integer.valueOf(x);
        
        // Unboxing
        int z = y.intValue();
        
        System.out.println("Boxing x into y: " + y);
        System.out.println("Unboxing y into z: " + z);
    }
    
    public static void coll02() { // ArrayList
        ArrayList list = new ArrayList();
        
        // add data into ArrayList
        list.add("ABC");
        list.add(2);
        list.add(true);
        list.add(new Student());
        
        // Get Object in ArrayList
        System.out.println(list.get(0));
        
        // Get size in ArrayList
        System.out.println(list.size());
        
        // insert Value with specific index
        list.add(2, "Hello");
        System.out.println(list);
        
        // Remove Object in ArrayList
        list.remove(1);
        System.out.println(list);
        
        // for each (in ArrayList can contain any type -> use [Object] type to get any)
        for(Object obj : list) {
            System.out.println(obj);
        }
        
        // loop 
        Iterator it = list.iterator();
        while(it.hasNext()) { // .hasNext() to check data 
            System.out.println(it.next());
        }
    }
    
    // Vector
    public static void coll03() { 
        HashSet h = new HashSet(); // same set in math 
        h.add(2);
        h.add(4.2);
        h.add(2); // not use in set -> useless
        h.add(true);
        System.out.println(h);
        
        ArrayList a = new ArrayList(); // ArrayList contain HashSet
        a.addAll(h);
        System.out.println(a);
    }
    
    public static void coll04() {
        TreeSet t = new TreeSet(); // sort data
        t.add(4);
        t.add(3);
        t.add(1);
        t.add(4); // useless
        t.add(2);
        System.out.println(t);
    }
    
    public static void coll05() {
        HashMap h = new HashMap(); // Map data with (key = value)
        h.put("ID", "B6225605");
        h.put("Name", "Mai Mai");
        h.put(2, new Student());
        System.out.println(h);
        System.out.println(h.containsKey("ID")); // check key -> true
        System.out.println(h.containsValue("Mai Mai")); // check value -> true
        System.out.println(h.containsValue("Mai")); // -> false
        System.out.println(h.get("ID"));
        
    }
    
    public static void coll06() {
        HashMap<String, String> h = new HashMap<String, String>(); // use <> to fit data type
        h.put("ID", "B6225605");
        h.put("Name", "Mai Mai");
//        h.put(2, new Student()); -> can't use <int, Strudent>
        System.out.println(h);
        System.out.println(h.containsKey("ID"));
        System.out.println(h.containsValue("Mai Mai"));
        System.out.println(h.containsValue("Mai"));
        System.out.println(h.get("ID"));
    }
    
    public static void coll07() {
        ArrayList<Student> arr = new ArrayList<>(); 
        arr.add(new Student());
        arr.add(new Student());
        System.out.println(arr);
    }
    
}
