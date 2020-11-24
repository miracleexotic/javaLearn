import java.util.Arrays;

public class passArr02 {
    
    public static void demoT5(String s[]) {
        for(int i = 0; i<s.length; i++) {
            s[i] = s[i].toUpperCase();
        }
    }

    public static void t5() {
        String[] planets = {
            "Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune"
        };
        demoT5(planets);
        System.out.println(Arrays.toString(planets));
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];
        for(int i = 0; i<a.length; i++) {
            for(int j = 0; j<a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void testAddMatrix() {
        double[][] a = {
            {2, 3},
            {4, 5},
            {6, 7}
        };
        double[][] b = {
            {20, 30},
            {40, 50},
            {60, 70}
        };
        double[][] c = addMatrix(a, b);
        // for(int i = 0; i<a.length; i++) {
        //     for(int j = 0; j<a[i].length; j++) {
        //         System.out.printf("c[%d][%d] = %.2f\n", i, j, c[i][j]);
        //     }
        // }
        for(int i = 0; i<c.length; i++) {
            System.out.println(Arrays.toString(c[i]));
        }
    }

    public static void main(String[] args) {
        testAddMatrix();
    }

}
