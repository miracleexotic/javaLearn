public class Q extends M {

    public Q(int num) {
        super(num);
        super.setName("Q");
    }

    // public void draw() {
    //     for (int i = 0; i<super.getNum(); i++) {
    //         for (int j = 0; j<super.getNum(); j++) {
    //             if (i == 0 || i == super.getNum()-1 || j == 0 || j == super.getNum()-1) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public void draw() {
    //     int n = super.getNum();
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print("0 ");
    //         }
    //         System.out.println();
    //     }
    // }
    //
    // 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0

    // public void draw() {
    //     int n = super.getNum();
    //     for (int i = 0; i < n; i++) {
    //         for (int k = 0; k < n*2; k++) {
    //             if (i == n-1 && k < n) {
    //                 System.out.print("x ");
    //             } else if ((k == n-1-i || k == n-1+i) && i != n-1) {
    //                 System.out.print("x");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    //
    //       x
    //      x x
    //     x   x
    //    x     x
    //   x       x
    //  x         x
    // x x x x x x x

    // public void draw() {
    //     int n = super.getNum();
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (i == 0 || j == n-1) {
    //                 System.out.print("*");
    //             } else if (j >= i){
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    //
    // *******
    //  ******
    //   *****
    //    ****
    //     ***
    //      **
    //       *

    // public void draw() {
    //     int n = super.getNum();
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (i == n-1 || j == 0) {
    //                 System.out.print("*");
    //             } else if (j <= i){
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // *
    // **
    // ***
    // ****
    // *****
    // ******
    // *******

    // public void draw() {
    //     int n = super.getNum();
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (i == n-1 || j == n-1) {
    //                 System.out.print("*");
    //             } else if (j >= n - i - 1){
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //       *
    //      **
    //     ***
    //    ****
    //   *****
    //  ******
    // *******

}
