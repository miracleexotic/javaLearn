package oot.lab7;

/**
 *
 * @author B6225605 นายณัฐัวตร บุญโสดากร
 */
public class MainClass {

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Visitor("Somsuk", "SUT");
        persons[1] = new Employee("Chana", "Project Manager", 30000);
        persons[2] = new Board("Thana", 25);

        for (Person person : persons) {
            person.getDetails();
        }
        
    }
}
