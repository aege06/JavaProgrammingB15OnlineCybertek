package day26;

public class ArrayReview {
    public static void main(String[] args) {

        int[] myNumbers = new int[4] ;
        myNumbers[0]  = 10 ;
        myNumbers[1]  = 40 ;
        myNumbers[2]  = 30 ;
        myNumbers[3]  = 7 ;
        // 1.3 I want to assign 3 item value to sum of first and second item
        myNumbers[2] = myNumbers[0] + myNumbers[1] ;
        System.out.println("New 3rd item value is : " + myNumbers[2]);
        // 1.4 Swap the first and last item value==++
        int temp = 0;
        temp = myNumbers[0];
        myNumbers[0] = myNumbers[3] ;
        myNumbers[3] =temp ;
        System.out.println("first item value is : "+ myNumbers[0]);
        System.out.println("last item value is : "+ myNumbers[3]);
    }
}


