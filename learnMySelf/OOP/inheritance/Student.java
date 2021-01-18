// child class, derived class, sub class
public class Student extends Person {  // inheritance ขยายความสามารถ

    private String id;
    private Address address;

    public void setID(String id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getID() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
    
}
