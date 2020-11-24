public class string02 {
     
    public static void demoCompare() {
        String s1 = "apple";
        if(s1 == "apple") {
            System.out.println("equal");
        } else {
            System.out.println("equal");
        }
    }

    public static void demoCompare2() {
        String s1 = "apple";
        String s2 = "app";
        System.out.println(s2 + "le");
        if(s1 == (s2 + "le")) { // not equal (== check addr)
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void demoCompare3() {
        String s1 = "apple";
        String s2 = "App";
        System.out.println(s2 + "le");
        if(s1.equalsIgnoreCase(s2 + "le")) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void demoCompareTo() {
        String s1 = "apple";
        String s2 = "banana";
        System.out.println(s1.compareTo(s2));

        String s3 = "apple";
        System.out.println(s1.compareTo(s3));

        String s4 = "coconut";
        System.out.println(s4.compareTo(s1));
        
    }

    public static void main(String[] args) {
        demoCompareTo();
    }

}
