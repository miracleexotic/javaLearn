// final -> can't inherit from this class
public final class ExStudent extends Student { // final subclass
    private String partner;

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getPartner() {
        return partner;
    }

}
