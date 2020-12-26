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
    }
    
    public double getTotalPrice() {
        for (Subject sub : s) {
            if(sub != null) {
                if(sub.getSubMajor().equalsIgnoreCase(student.getMajor())) {
                    totalPriceMajor += sub.getCredit() * 800;
                } else {
                    totalPriceNonMajor += sub.getCredit() * 800;
                }
            }
        }
        return totalPriceNonMajor;
    }
    
    public double getScholarship() {
        return totalPriceMajor;
    }
    
}
