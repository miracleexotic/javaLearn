package oot.lab5;

import java.util.Arrays;

public class Register {
    private Student student;
    private Subject s[] = new Subject[10];
    private int count = 0;
    private double totalPriceMajor = 0;
    private double totalPriceNonMajor = 0;
    
    public Register() {
    }
    
    public Register(Student student) {
        this.student = student;
    }
    
    public Student getStudent() {
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    
    public void order(Subject sub) {
        s[count++] = sub;
        System.out.println(student.getName() + " register " + sub.getSubname() +
                " [" + sub.getSubMajor() + "] " + sub.getCredit() + " credit");
        if(sub.getSubMajor().equalsIgnoreCase(student.getMajor())) {
            totalPriceMajor += sub.getCredit() * 800;
        } else {
            totalPriceNonMajor += sub.getCredit() * 800;
        }
    }
    
    public double getTotalPrice() {
        System.out.println(Arrays.toString(s));
        return totalPriceNonMajor;
    }
    
    public double getScholarship() {
        return totalPriceMajor;
    }
    
}
