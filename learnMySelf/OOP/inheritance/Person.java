import java.time.LocalDate;
import java.time.Period;

// parent, super class
// abstract -> can't build instance or object
public abstract class Person { // abstract class
    private String fName, lName;
    private LocalDate dob;
    
    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int ageYears() {
        Period p = Period.between(dob, LocalDate.now());
        return p.getYears();
    }

}
