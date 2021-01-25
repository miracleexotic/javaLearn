public abstract class Mark {
    private int s1;
    private int s2;
    private int s3;
    private int s4;

    public Mark(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public Mark(int s1, int s2, int s3, int s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public abstract void getPercentage();

    public int getS1() {
        return s1;
    }
    public int getS2() {
        return s2;
    }
    public int getS3() {
        return s3;
    }
    public int getS4() {
        return s4;
    }

}
