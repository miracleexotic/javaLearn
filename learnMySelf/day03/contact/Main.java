public class Main {

    public static void demo1() {
        Contact p1 = new Contact();
        p1.setFirstName("petEr"); // Perter
        p1.setLastName("PARKER"); // Parker
        p1.setPhoneNumber("(08)-1458-7890"); // 0814587890
        System.out.println(p1);
        System.out.println(p1.prettyFormatPhoneNumber());

        Contact p2 = new Contact("bruce", "wAyNe", "022181234");
        System.out.println(p2);
        System.out.println(p2.getPhoneNumber());

        
    }

    public static void main(String[] args) {
        demo1();
    }

}


