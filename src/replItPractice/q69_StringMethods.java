package replItPractice;

import java.util.Scanner;

public class q69_StringMethods {
    public static void main(String[] args) {
        //Write a program that will print out first half of the word twice.

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.substring(0,(word.length()/2))+word.substring(0,(word.length()/2)));
    }
}
