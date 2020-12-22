package lab5;

public class University {

    private String uname = "";
    private String province = "";

    public University() {
    }

    public University(String name, String province) {
        this.uname = name;
        this.province = province;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String name) {
        this.uname = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}
