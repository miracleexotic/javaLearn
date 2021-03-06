/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2;

/**
 *
 * @author IAMMAI
 */
public class Koo {
    public Koo() {
        System.out.println("Koo constructor");
    }
    public void process() {
        System.out.println("Koo doing");
    }
    public void calculate(int n) {
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
