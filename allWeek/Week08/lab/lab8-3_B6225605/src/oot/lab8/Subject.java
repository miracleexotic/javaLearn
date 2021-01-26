package oot.lab8;

public class Subject {

    private String id;
    private String name;
    private String teacher;
    private int weight;

    public Subject(String string) {
        String[] strArr = new String[4];
        strArr = string.split(", ");
        this.id = strArr[0].substring(3);
        this.name = strArr[1].substring(5).toUpperCase();
        this.teacher = strArr[2].substring(8, 9).toUpperCase() + strArr[2].substring(9);
        char c = strArr[3].charAt(7);
        this.weight = c - '0';
    }

    public void getDetail() {
        System.out.println(id + " " + name);
        System.out.println("Teacher: " + teacher);
        System.out.println("weight: " + weight);
        System.out.println();
    }
}
