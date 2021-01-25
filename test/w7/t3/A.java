public class A extends Mark {
    public A(int s1, int s2, int s3) {
        super(s1, s2, s3);
    }

    public void getPercentage() {
        System.out.println((super.getS1()+super.getS2()+super.getS3())/3.0);
    }

}
