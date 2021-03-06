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
public class Noo extends Koo {
    public Noo() {
        System.out.println("Noo constructor");
    }
    public void process() {
        System.out.println("Noo doing, override");
    }
    public void process(String str) {
        System.out.println("Noo doing, overload");
    }
}
