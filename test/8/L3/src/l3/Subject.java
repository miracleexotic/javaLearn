package l3;

public class Subject {
    private String id;
    private String name;
    private String teacher;
    private int weight;
    
    public Subject(String string) {
        String[] str = string.split(", ");
        this.id = str[0].substring(3);
        this.name = str[1].substring(5).toUpperCase();
        this.teacher = str[2].substring(8,9).toUpperCase()+str[2].substring(9).toLowerCase();
        this.weight = Integer.parseInt(str[3].substring(7));
    }
    
    public void getDetail() {
        System.out.println(id + " " + name);
        System.out.println("Teacher: " + teacher);
        System.out.println("weight: " + weight);
        System.out.println();
    }
    
}
