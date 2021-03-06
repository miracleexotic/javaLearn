package l3;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String major;
    
    public Student(String id, String firstName, String lastName, String major) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }
    
    public void getDetail() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.firstName.toUpperCase()+" "+this.lastName.toUpperCase());
        System.out.println("Major: " + this.major.toUpperCase());
    }
    
    
}
