package replItPractice;

import java.util.Scanner;

public class q97_CountJava {
    //Return the number of times that the string "java" appears anywhere in the given string word.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            if (word.substring(i).startsWith("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

