package day07;

import java.util.Scanner;

public class introToWhatIfStatement {
    public static void main(String[] args) {

        System.out.println("What did you get on your exam? ");
        Scanner scan =new Scanner(System.in);
        int score = scan.nextInt();
        //if(PUT YOUR CONDITION HERE) the open a { do this if the condition is true}

        if(score >60) {
            System.out.println("Passed the exam!! Congratulations!");
        } else {
            System.out.println(" Try harder next time! DO NOT GIVE UP! ");
        }
        System.out.println("THE END!!!");



    }
}
