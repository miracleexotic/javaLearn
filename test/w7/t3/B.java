public class B extends Mark{
    public B(int s1, int s2, int s3, int s4) {
        super(s1, s2, s3, s4);
    }

    public void getPercentage() {
        System.out.println((super.getS1()+super.getS2()+super.getS3()+super.getS4())/4.0);
    }
}
