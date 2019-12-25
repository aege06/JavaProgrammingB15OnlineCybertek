package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {
        int num=15;
        if(num%5==0 && num%3==0){
            System.out.println("It is a FizzBuzz number");
        }
        else if(num%5==0){
            System.out.println("It is a Fizz number");
        }
        else if (num%3==0){
            System.out.println("It is a Buzz number");
        }
        else {
            System.out.println("NOT MY NUMBER!!!!!");
        }

        }
            }




