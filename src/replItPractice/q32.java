package replItPractice;

import java.util.Scanner;

public class q32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter seconds:");

        int hours;
        int minutes;
        int seconds;
        int inputSeconds=scan.nextInt();
        hours = (inputSeconds/60)/60;
        minutes = (inputSeconds/60)%60;
        seconds = inputSeconds%60;
        System.out.println(hours+ " hours, " +minutes+ " minutes, and " +seconds+ " seconds");

      //  hours=minutes*60;
       // minutes=hours/60;
       // seconds=minutes/60;

       // And for minutes it will be (inputseconds%3600)/60
        //(inputSeconds%3600)%60;








      /*  Write a program that outputs the number of hours, minutes, and seconds that
        corresponds to input total seconds.

                -create a Scanner object
                - declare int variables inputSeconds, hours, minutes, seconds
                -Ask user enter seconds by printing:
        "Enter seconds:"

                -Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
                -Assign values to the hours, minutes, seconds variables
                -Display the result.

        Example run:
        Enter seconds:
        3695
        1 hours, 1 minutes, and 35 seconds*/
    }
}
