package oot.lab9;

public class Patient {
    private String id;
    private String dna;
    
    public Patient() {
    }
    
    public Patient(String id, String dna) {
        this.id = id;
        this.dna = dna;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getDna() {
        return dna;
    }
    
    public void setDna(String dna) {
        this.dna = dna;
    }
    
}
