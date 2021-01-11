package quiz.q3;

public class Student {

    private String name = "";
    private String major = "";

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getMajor() {
        return major;
    }
    


}
