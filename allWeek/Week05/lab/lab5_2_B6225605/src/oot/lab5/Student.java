package oot.lab5;

public class Student {
    private String name = "";
    private String sid = "";
    private String major = "";
    
    public Student() {
    }
    
    public Student(String sid, String name, String major) {
        this.sid = sid;
        this.name = name;
        this.major = major;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSid() {
        return sid;
    }
    
    public void setsid(String sid) {
        this.sid = sid;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
}
