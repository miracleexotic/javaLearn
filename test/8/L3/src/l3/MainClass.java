package l3;

public class MainClass {

    public static void main(String[] args) {
        Subject s1 = new Subject("id:523555, name:Oot, teacher:pUMRAPEE, weight:4");
        Subject s2 = new Subject("id:523272, name:lab elec., teacher:wichai, weight:1");
        Subject s3 = new Subject("id:523332, name:se, teacher:chanwit, weight:4");

        s1.getDetail();
        s2.getDetail();
        s3.getDetail();
    }
    
}
