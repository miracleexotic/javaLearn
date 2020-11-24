public class forloop02 {
    
    public static void multiplicationTable(int n) {
        for (int i=1; i<=12; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }

    public static void printChar() {
        for (char c = 'A'; c <= 'Z'; c++) { // char use '' and string use ""
            System.out.printf("%c", c);
        }
    }

    public static void printChar2() {
        for (int c = 65; c <= 90; c++) { 
            System.out.printf("%d -> %c\n", c, (char)c);
        }
    }

    public static void printChar3(char fromCh, char toCh) {
        for (char c = fromCh; c <= toCh; c++) { 
            System.out.printf("%d %04X %c\n", (int)c, (int)c, c);
        }
    }

    public static void main(String[] args) {
        printChar3('A', 'Z');
        // multiplicationTable(5);
    }

}
