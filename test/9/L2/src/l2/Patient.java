package l2;

public class Patient {
    private String name;
    private String dna;
    
    public Patient(String name, String dna) {
        this.name = name;
        this.dna = dna;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDna() {
        return dna;
    }
    
}
