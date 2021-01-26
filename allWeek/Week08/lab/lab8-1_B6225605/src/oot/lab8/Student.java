package oot.lab8;

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
        int countUnits = 0;
        for (int i = 0; i < subjects.length(); i += 2) {
            switch (subjects.charAt(i)) {
                case 'A':
                    gpa += 4 * ((int) subjects.charAt(i + 1) - (int) '0');
                    countUnits += ((int) subjects.charAt(i + 1) - (int) '0');
                    numSubject++;
                    break;
                case 'B':
                    gpa += 3 * ((int) subjects.charAt(i + 1) - (int) '0');
                    countUnits += ((int) subjects.charAt(i + 1) - (int) '0');
                    numSubject++;
                    break;
                case 'C':
                    gpa += 2 * ((int) subjects.charAt(i + 1) - (int) '0');
                    countUnits += ((int) subjects.charAt(i + 1) - (int) '0');
                    numSubject++;
                    break;
                case 'D':
                    gpa += 1 * (subjects.charAt(i + 1) - '0');
                    countUnits += ((int) subjects.charAt(i + 1) - (int) '0');
                    numSubject++;
                    break;
                case 'F':
                    numSubject++;
                    break;
                default:
                    gpa = -1;
                    numSubject++;
                    break;
            }
        }
        gpa = gpa == -1 ? gpa : gpa/countUnits;
        if (subjects.indexOf('F') == -1 && subjects.indexOf('I') == -1 && gpa >= 3.00) {
            isApplicable = true;
        }
    }

    public void display() {
        System.out.println(name + " registered " + numSubject + " subjects");
        System.out.println(name + " has got GPA = " + (gpa == -1 ? "incomplete" : gpa));
        if (isApplicable) {
            System.out.println(name + " is applicable for Scholarship");
        }
    }
}
