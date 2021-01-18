package polymor;

public abstract class Animal {
    
    public static String staticVariable = "This varible are at Animal class";
    
    private final String name;
    private int age;
    private String type;
    
    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
        System.out.println(name + " Create");
    }
    
//    public void setName(String name) {
//        this.name = name;
//    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getType() {
        return type;
    }
    
    // B6225605 นายณัฐวัตร บุญโสดากร
    public abstract void eat(String food); // abstract method doesn't have body 
    
}
