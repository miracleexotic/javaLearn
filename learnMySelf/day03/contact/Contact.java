/**
 * Contact
 */
public class Contact {

    private String firstName, lastName;
    private String phoneNumber;

    public Contact() {}

    public Contact(String firstName, String lastName, String phoneNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        // this.firstName = fisrtName;
        // this.lastName = lastName;
        // this.phoneNumber = phoneNumber;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = Utils.capitalizedFirstCharOfString(firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = Utils.capitalizedFirstCharOfString(lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        // \D -> non numeric character
        this.phoneNumber = phoneNumber.replaceAll("[\\D]", "");
    }

    public String getPhoneNumber() {
        return prettyFormatPhoneNumber();
    }

    public String prettyFormatPhoneNumber() {
        if (phoneNumber.length() == 9) {
            return phoneNumber.replaceAll("(\\d{2})(\\d{3})(\\d{4})", "($1)-$2-$3");
        } else {
            return phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1)-$2-$3");

        }
    }

    @Override
    public String toString() {
        return "Contact{" + 
            "firstName=" + firstName + '\'' + 
            ", lastName=" + lastName + '\'' + 
            ", phoneNumber=" + prettyFormatPhoneNumber() + '\'' + 
            '}';
    }

}



