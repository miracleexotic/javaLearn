package oot.lab5;

public class Timetable {

    public static void main(String[] args) {
        Student s1 = new Student("B5700001", "Aran", "CPE");
        Student s2 = new Student("B5900002", "Aranya", "IT");
        Student s3 = new Student("B6200003", "Arthit", "ME");
        
        Subject sub1 = new Subject("523101", "COMPUTER PROGAMMING I", "CPE", 2);
        Subject sub2 = new Subject("523202", "COMPUTER PROGAMMING II", "CPE", 2);
        Subject sub3 = new Subject("523203", "PROBLEM SOLVING WITH PROGRAMMING"
                , "CPE", 2);
        Subject sub4 = new Subject("523411", "ARTIFICIAL INTELLIGENCE IN APPLICATIONS"
                , "CPE", 4);
        Subject sub5 = new Subject("525101", "ENGINEERING GRAPHICSI", "ME", 2);
        Subject sub6 = new Subject("525206", "ENGINEERING GRAPHICS II", "ME", 2);
        
        Register r1 = new Register(s1);
        Register r2 = new Register(s2);
        Register r3 = new Register(s3);
        
        r1.order(sub1);
        r1.order(sub3);
        r1.order(sub5);
        System.out.println(r1.getStudent().getName() + "["+r1.getStudent().getMajor()+"]" + " have scholarship " + r1.getScholarship() + " bath and have to pay " + r1.getTotalPrice() + " baht\n");
        
        r2.order(sub4);
        r2.order(sub5);
        System.out.println(r2.getStudent().getName() + "["+r2.getStudent().getMajor()+"]" + " have scholarship " + r2.getScholarship() + " bath and have to pay " + r2.getTotalPrice() + " baht\n");
        
        r3.order(sub1);
        r3.order(sub4);
        r3.order(sub6);
        System.out.println(r3.getStudent().getName() + "["+r3.getStudent().getMajor()+"]" +" have scholarship " + r3.getScholarship() + " bath and have to pay " + r3.getTotalPrice() + " baht\n");
    }
    
}
