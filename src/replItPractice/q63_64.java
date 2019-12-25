package replItPractice;

import java.util.Scanner;

public class q63_64 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        int nameLength=word.length();
        int lastCharIndex=nameLength-1;
        char lastChar = word.charAt(lastCharIndex);
        System.out.println(lastChar);
        char firstLetter=word.charAt(0);
        System.out.println(firstLetter);


    }
}
