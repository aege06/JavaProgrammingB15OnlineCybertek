package replItPractice;
import java.util.Scanner;
public class q146Methods1_SimpleCalculator {
    public static void main(String[] args) {
       /* create a static method called "plus", its return is void and it gets no arguments.

        It asks the user to input two numbers, then it will add them and print the result.
        Create a scanner within plus method.*/

        plus();


    }

    public static void plus(){
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("result: "+(num1+num2));


       // System.out.println("result: " + (scan.nextInt() + scan.nextInt()));




    }


    }
