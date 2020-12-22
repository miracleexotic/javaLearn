package oot.lab5;

public class Subject {
    private String subname = "";
    private String subid = "";
    private String submajor = "";
    private int credit;
    
    public Subject() {
    }
    
    public Subject(String subid, String subname, String submajor, int credit) {
        this.subid = subid;
        this.subname = subname;
        this.submajor = submajor;
        this.credit = credit;
    }
    
    public String getSubname() {
        return subname;
    }
    
    public void setSubname(String subname) {
        this.subname = subname;
    }
    
    public String getSubid() {
        return subid;
    }
    
    public void setSubid(String subid) {
        this.subid = subid;
    }
    
    public String getSubMajor() {
        return submajor;
    }
    
    public void setSubMajor(String submajor) {
        this.submajor = submajor;
    }
    
    public int getCredit() {
        return credit;
    }
    
    public void setCredit(int credit) {
        this.credit = credit;
    }
    
}
