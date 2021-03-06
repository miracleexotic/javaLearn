package l1;

public class Student {
    private String name;
    private int numSubject = 0;
    private double gpa = 0.00;

    // if GPA >= 3.00 and Don’t have F or I Then isApplicable is True
    private boolean isApplicable = false;

    public Student(String name, String subjects) {
        this.name = name;
        calculateGPA(subjects);
    }
    
    public void calculateGPA(String subjects) {
        numSubject = subjects.length() / 2;
        int num = 0;
        for(int i = 0; i<subjects.length(); i+=2) {
            char c = subjects.charAt(i);
            switch(c) {
                case 'A' :
                    gpa += 4 * (subjects.charAt(i+1) - '0');
                    break;
                case 'B' :
                    gpa += 3 * (subjects.charAt(i+1) - '0');
                    break;
                case 'C' :
                    gpa += 2 * (subjects.charAt(i+1) - '0');
                    break;
                case 'D' :
                    gpa += (subjects.charAt(i+1) - '0');
                    break;
                default :
                    gpa = -1;
                    break;
            }
            num += subjects.charAt(i+1) - '0';
            if(gpa == -1) {
                break;
            }
        }
        gpa = (gpa == -1 ? gpa : gpa / num);
        if(subjects.indexOf("F")==-1 && subjects.indexOf("I")==-1 && gpa >= 3.00) {
            isApplicable = true;
        }
    }
    
    public void display() {
        System.out.println(name + " registered " + numSubject + " subjects");
        System.out.println(name + " has got GPA = " + (gpa == -1 ? "incomplete" : gpa));
        if(isApplicable) {
            System.out.println(name + " is applicable for Scholarship");
        }
    }
    
}
