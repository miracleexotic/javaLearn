public class string01 {
    
    public static void demo1() {
        String s1 = "Rain";
        String s2 = "bow";
        String s3 = "Over the " + s1 + s2;
        System.out.println(s3);
        System.out.println(s3.length());

        System.out.println(s3.substring(0, 4)); // (inclusive, exclusive)
        System.out.println(s3.substring(1, 4));
        System.out.println(s3.toUpperCase());
        System.out.println(stringWithPosition(s3));
        System.out.println(s3.indexOf("t"));
    }

    public static String stringWithPosition(String s) {
        String pos = "";
        for (int i = 0; i < s.length(); i++) {
            pos += (i % 10);
        }
        return String.format("%s\n%s", pos, s);
    }

    public static void main(String[] args) {
        demo1();
        
    }

}
