package replItPractice;

import java.util.Scanner;

public class q60TernaryOperator {
    public static void main(String[] args) {
        /*Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:
Display x if x is greater than or equal to 5
Display -x if x is less than 5

DO NOT USE IF STATEMENT or SWITCH CASE*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        int result = (x>=5)? x:0-x;
        System.out.println(result);
    }
}
