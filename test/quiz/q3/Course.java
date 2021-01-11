package quiz.q3;

public class Course {

    private String Cid = "";
    private String Cname = "";
    private int credit = 0;

    public Course() {
    }

    public Course(String Cid, String Cname, int credit) {
        this.Cid = Cid;
        this.Cname = Cname;
        this.credit = credit;
    }

    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    public String getCid() {
        return Cid;
    }
    
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getCname() {
        return Cname;
    }
    
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }
    
}
