package day06;

public class PreincremenetDecrementOperator {
    public static void main(String[] args) {
        int offerCount = 2;
      //  offerCount = offerCount +1;
      //  offerCount += 1;
        ++ offerCount ;

        System.out.println("Offer now after increasing by one " + offerCount);
    -- offerCount;
        System.out.println("Offer now after decreasing by one " +offerCount);
    }
}
