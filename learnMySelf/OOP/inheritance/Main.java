import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFName("iam");
        s1.setLName("mai");
        s1.setID("B62XXXXX");
        s1.setDob(LocalDate.of(2000, Month.JULY, 31));
        System.out.println("Age s1 = " + s1.ageYears());

        Staff sf1 = new Staff();
        sf1.setFName("jao");
        sf1.setLName("jai");
        sf1.setPosition("admin");
        sf1.setDob(LocalDate.of(1990, Month.DECEMBER, 20));
        System.out.println("Age sf1 = " + sf1.ageYears());

        ExStudent es1 = new ExStudent();
        es1.setFName("m");
        es1.setLName("j");
        es1.setPartner("ABC university");
    }
}







