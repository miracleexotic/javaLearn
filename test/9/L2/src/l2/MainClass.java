package l2;

public class MainClass {

    public static void main(String[] args) throws Exception {
        Patient[] patients = new Patient[5];
        patients[0] = new Patient("HN1234", "G1C1T1A1");
        patients[1] = new Patient("HN4233", "G1C2T2A1");
        patients[2] = new Patient("HN1232", "G2C1A2");
        patients[3] = new Patient("HN1", "G2C1T1A2");
        patients[4] = new Patient("XN1234", "G1C1T2A2");
        
        for (Patient patient: patients) {
            diag(patient);
        }
    }
    
    public static void diag(Patient p) throws Exception {
        try {
            if(!(p.getName().subSequence(0, 2).equals("HN")) || p.getName().length() < 3) {
                throw new InvalidIdException("InvalidIdException: Id \'" +p.getName()+ "\' invalid");
            }
            if(!p.getDna().contains("G") || !p.getDna().contains("C") || !p.getDna().contains("T") || !p.getDna().contains("A")) {
                throw new IncompleteException("IncompleteException: Sequence \'" +p.getDna()+"\' incomplete" );
            }
            System.out.println(p.getName() + " : " + p.getDna());
        } catch (IncompleteException | InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
