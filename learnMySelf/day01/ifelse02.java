public class ifelse02 {
    
    public static String stromType(int speed) {
        String stromName = "";
        if (speed < 63) {
            stromName = "Depression";
        } else if (speed >= 63 && speed < 118) {
            stromName = "Tropical strom";
        } else {
            stromName = "Typhoon";
        }
        return stromName;
    }

    public static int zodiac(int buddhistYear) {
        int z = buddhistYear % 12;
        int s = 0;
        switch(z) {
            case 0:
                s = 0;
                break;
            case 1:
                s = 1;
                break;
            case 2:
                s = 2;
                break;
            case 3:
                s = 3;
                break;
            case 12:
                s = 12;
                break;
        }
        return s;
    }

    public static String testSW(int num) {
        String s = "";
        switch(num) {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
            case 3:
                s = "three";
                break;
            default:
                s = "exceed";

        }
        return s;
    }

    public static void main(String[] agrs) {
        System.out.println(stromType(220));
        System.out.println(zodiac(2563));
        System.out.println(testSW(1));
        System.out.println(testSW(2));
        System.out.println(testSW(3));
        System.out.println(testSW(0));
    }

}
