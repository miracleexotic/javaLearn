package lab5;

public class MainClass {

    public static void main(String[] args) {
        Team t1 = new Team("T001", "Apple", 5);
        Team t2 = new Team("T002", "Flower");
        Team t3 = new Team();
        University u1 = new University("SUT", "Nakhon Ratchasima");
        University u2 = new University("KKU", "Khon Kaen");
        University u3 = new University("CU", "Bangkok");
        t3.setPerson(6);
        t3.setTid("T003");
        t3.setName("Animal");
        t3.setPerson(4);
        t1.setUniversity(u1);
        t2.setUniversity(u3);
        t3.setUniversity(u2);
        
        System.out.printf("%10s%10s%10s%20s%20s\n", "Team ID", "Team Name", 
                "Person", "University", "Province");
        display(t1);
        display(t2);
        display(t3);
        
    }
    
    public static void display(Team t) {
        System.out.printf("%10s%10s%10s%20s%20s\n", t.getTid(), t.getName(), // 1
                t.getPerson(), t.getUniversity().getUname(), 
                t.getUniversity().getProvince());
    }
    
}
