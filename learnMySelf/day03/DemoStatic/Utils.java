/**
 * Utils
 */
public class Utils {

    public static float vatRate = 0.07f; // static field

    public static String capitalizedFisrtChar(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static String removeAllNonNumber(String s) {
        return s.replaceAll("[\\D]", "");
    }

}

