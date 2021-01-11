package oot.lab5;

import java.util.Arrays;

public class Register {
    private Student student;
    private Subject s[] = new Subject[10];
    private int count = 0;
    private double[] pri = {0, 0};
    
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
        this.pri[0] = this.pri[1] = 0;
        for (Subject sub : s) {
            if(sub != null) {
                if(sub.getSubMajor().equalsIgnoreCase(student.getMajor())) {
                    // System.out.println(sub.getSubMajor() + "=" + student.getMajor());
                    this.pri[0] += sub.getCredit() * 800;
                    // System.out.println(getTotalPriceMajor());
                } else {
                    // System.out.println(sub.getSubMajor() + "=" + student.getMajor());
                    this.pri[1] += sub.getCredit() * 800;
                }
            }
        }
        return this.pri[1];
    }
    
    public double getScholarship() {
        getTotalPrice();
        return this.pri[0];
    }
    
}
