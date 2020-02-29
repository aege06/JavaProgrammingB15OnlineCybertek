package replItPractice;

import java.util.Scanner;

public class q110_ArraysPrintFirstLastCharI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below

        for (String word : words) {
            System.out.println("" + word.charAt(0) + word.charAt(word.length() - 1));
        }
    }
}