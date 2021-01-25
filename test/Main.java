public class Main {
    public static void main(String[] args) {
        M n = new N(5);
        M p = new P(6);
        Q q = new Q(7);

        display(n);
        display(p);

        draw(p);
        draw(q);

    }

    public static void display(M m) {
        System.out.println(m.getName() + " result = " + m.getNum());
    }

    public static void draw(M m) {
        m.draw();
    }

}