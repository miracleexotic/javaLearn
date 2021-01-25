package quiz4;

/**
 *
 * @author B6225605 นายณัฐวัตร บุญโสดากร
 */
public class MainClass {

    public static void main(String[] args) {
        Toy dice = new Dice();
        Toy dart = new Dart();
        Ball ball = new Ball();

        show(dice);
        show(dart);

        bounce(dice);
        bounce(ball);
    }

    public static void show(Toy toy) {
        System.out.println("play " + toy.getType());
    }

    public static void bounce(Rand rand) {
        rand.random();
    }

}
