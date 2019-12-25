package day17;

public class FizzBuzzTest {
    //if a number can be divided by both  3 and 5 ----- FizzBuzz number
    // if a number can be divided by 5 ----------- fizz number
    //if a number can be divided by 3 ------------ buzz number
    public static void main(String[] args) {

       int num=1;
       while(num<=100){

        if(num%5==0 && num%3==0) {
            System.out.println(num + " is Fizz Buzz number ");
        }else if(num%5==0) {
            System.out.println(num + " is fizz number ");
        }else if(num%3==0){
            System.out.println(num+ " is buzz number ");
        }
              ++num;

        }

    }
}
//  int num=1;
//while(num<=100){
//  System.out.print(num+ " ");
//++num;
