package lab5;

public class Team {
    private String name = "";
    private String tid = "";
    private int person = 0;
    private University university = null;
    
    public Team() {
    }
    
    public Team(String tid, String name) { // 2
        this.tid = tid;
        this.name = name;
    }
    
    public Team(String tid, String name, int person) { // 3
        this.tid = tid;
        this.name = name;
        this.person = person;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTid() {
        return tid; // 4
    }
    
    public void setTid(String tid) {
        this.tid = tid; // 5
    }
    
    public int getPerson() {
        return person;
    }
    
    public void setPerson(int person) {
        this.person = person;
    }
    
    public University getUniversity() { // 6
        return university;
    }
    
    public void setUniversity(University university) {
        this.university = university;
    }
    
}
