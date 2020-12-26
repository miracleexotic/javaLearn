package quiz3;

public class Register {

    private Student student;
    private Course course;

    public Register() {
    }

    public Register(Student student, Course course) {
        this.setStudent(student);
        this.setCourse(course);
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public String toString() {
        return getStudent().getName() + " registers to " + 
                getCourse().getCid() + " " + getCourse().getCname();
    }
    
}
