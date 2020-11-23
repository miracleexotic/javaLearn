public class ifelse01 {

    public static boolean testscore(int interviewScore, int engScore) {
        boolean isOk;
        if (interviewScore > 70 || engScore > 50) { // AND && OR ||
            isOk = true;
        } else {
            isOk = false;
        }
        return isOk;
    }

    public static void main(String[] args) {
        System.out.println(testscore(75, 40));
        System.out.println(testscore(75, 60));
        /*
        int score;
        score = 47;
        if (score >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("not pass");
        }
        */
    }

}
