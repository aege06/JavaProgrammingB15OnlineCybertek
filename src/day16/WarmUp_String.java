package day16;

import java.util.Scanner;

public class WarmUp_String {
    public static void main(String[] args) {

        // 1st way
        //   Scanner scan = new Scanner(System.in);
        //  String word1 = scan.next();
        //  String word2 = "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        //  System.out.println(word2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word1: ");
        String word1 = scan.nextLine();
        String word2 = word1.charAt(3) + "" + word1.charAt(2) + "" + word1.charAt(1) + "" + word1.charAt(0);
        System.out.println(word1 + " reverse : " + word2);
    }
}
