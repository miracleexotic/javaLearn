package quiz4;

/**
 *
 * @author B6225605 นายณัฐวัตร บุญโสดากร
 */
public class Dice extends Toy {

    public Dice() {
        super();
        super.setType("dice by spinning");
    }

    public void random() {
        System.out.println("\ndice are bounced for getting score.");
        System.out.println("Score (Random 1-6) is " + (Toy.rand.nextInt(6) + 1) + ".");
    }
}
