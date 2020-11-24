public class forloop01 {

    public static void demo1() {
        for (int i=1; i<=5; i++) {
            System.out.println(i);
            System.out.println("---");
        }
        System.out.println("Bye");
    }

    public static void demo2() {
        for (int i=1; i<=10; i+=2) {
            System.out.println(i);
            System.out.println("---");
        }
        System.out.println("Bye");
    }

    public static void demo3() {
        for (int i=10; i>=1; i--) {
            System.out.println(i);
            System.out.println("---");
        }
        System.out.println("Bye");
    }

    public static void sum1() {
        int result = 0;
        for (int i=1; i<=3; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static int sum(int fromNum, int toNum) {
        int result = 0;
        for (int i=fromNum; i<=toNum; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(8, 10));
    }

}