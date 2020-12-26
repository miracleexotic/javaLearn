package quiz3;

public class MainClass {

    public static void main(String[] args) {
        Student s1 = new Student("Kai");
        Student s2 = new Student("Nok", "CPE");
        s1.setMajor("CPE");
        Course c1 = new Course();
        Course c2 = new Course("523480", "CPE Project", 4);
        c1.setCid("523232");
        c1.setCname("OOT");
        c1.setCredit(4);
        Register r1 = new Register(s1, c1);
        Register r2 = new Register(s2, c2);

        System.out.println(r1);
        System.out.println(r2);
    }

}
