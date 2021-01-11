package quiz.q3;

public class Register {
    
    private Student s = new Student();
    private Course c = new Course();

    public Register() {
    }

    public Register(Student s, Course c) {
        this.s = s;
        this.c = c;
    }

    public String toString() {
        return s.getName() + " registers to " + c.getCid() + " " + c.getCname();
    }

}
