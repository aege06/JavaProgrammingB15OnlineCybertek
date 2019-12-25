package day11;


import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        System.out.println("What is your score on the exam? ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("INVALID SCORE!!!");
        } else if (score == 100) {
            System.out.println("PERFECT SCORE!!!");
        } else if (score == 70 - 100) {
            System.out.println("YOU PASSED!!!");
        } else {
            System.out.println("YOU FAILED!!!");

        }
    }
}


