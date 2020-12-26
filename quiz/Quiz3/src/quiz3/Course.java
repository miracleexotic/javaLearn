package quiz3;

public class Course {

    private String cId;
    private String cName;
    private int credit;

    public Course() {
    }

    public Course(String cId, String cName, int credit) {
        this.setCid(cId);
        this.setCname(cName);
        this.setCredit(credit);
    }

    public void setCid(String cId) {
        this.cId = cId;
    }

    public String getCid() {
        return cId;
    }

    public void setCname(String Cname) {
        this.cName = Cname;
    }

    public String getCname() {
        return cName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

}
