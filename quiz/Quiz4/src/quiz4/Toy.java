package quiz4;

/**
 *
 * @author B6225605 นายณัฐวัตร บุญโสดากร
 */
import java.util.Random;

public abstract class Toy implements Rand {

    private String type;
    public static Random rand = new Random();

    public Toy() {

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
