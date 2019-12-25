package day17;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        int evenNumber=0;
        while (evenNumber<=50){
            System.out.print(evenNumber+ " ");
            evenNumber=evenNumber+2;

            }
        System.out.println("------------------");

         int oddNumber=1;
         while(oddNumber<=50) {
             System.out.print(oddNumber + " ");
             oddNumber +=2;
         }

        System.out.println("-------------------");
         int cnt3=0;
         while(cnt3<=50){
             if(cnt3%2==0) {
                 System.out.println(cnt3 + " is even number");
             }else{
                 System.out.println(cnt3+  " is odd number");
             }
             ++cnt3;
         }
        }
    }

