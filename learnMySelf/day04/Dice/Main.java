public class Main {

    public static void demoDice1() {
        long start = System.currentTimeMillis();
        Dice aDice = new Dice();
        for(int i = 0; i<10000; i++) {
            System.out.println(aDice.roll());
        }
        long stop = System.currentTimeMillis();
        System.out.printf("elapsed time = %d", stop-start);
        
    }

    public static void demoDice2() {
        long start = System.currentTimeMillis();
        DiceV2 aDice = new DiceV2();
        for(int i = 0; i<10000; i++) {
            System.out.println(aDice.roll());
        }
        long stop = System.currentTimeMillis();
        System.out.printf("elapsed time = %d\n", stop-start);
        aDice.showFreqs();
    }

    public static void main(String[] args) {
        // demoDice1();
        // demoDice2();
        // System.out.println("\u2680 \u2685");
        DiceV2 d = new DiceV2();
        for(int i = 0; i<10; i++) {
            System.out.println(DiceV2.numberToFace(d.roll()));
        }
        

    }
    
}