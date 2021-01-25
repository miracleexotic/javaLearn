public class P extends M {

    public P(int num) {
        super(num);
        super.setName("P");
    }

    public void draw() {
        int n = super.getNum();
        for (int i = n; i>0; i--) {
            for (int j = i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
