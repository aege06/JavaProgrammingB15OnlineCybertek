package day05;

import java.util.Scanner;

public class minuteDayPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days a week do you go to work?");
        int day = scan.nextInt();
        int minute = (day*8*60);
        System.out.println("You work " + minute+ " minutes in a day.");
    }
}
