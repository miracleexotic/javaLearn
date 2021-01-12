package oot.lab6;

/**
 *
 * @author B6225605-นายณัฐวัตร-บุญโสดากร
 */
public class MainClass {

    public static void main(String[] args) {
        Cat c1 = new Cat("Oscar", "gray", "Persian");
        c1.sound();
        Dog d1 = new Dog(); // new animal
        Dog d2 = new Dog("Tigger", "white");
        d2.sound();
    }

}
