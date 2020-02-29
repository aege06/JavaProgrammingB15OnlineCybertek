package replItPractice;

import java.util.Scanner;

public class q73_MiddleThree {

    //    You have a word, do the following:
//    If the word has odd number of characters
//    and has 5 or more characters, print the middle three
//    characters of the word.
//    Otherwise print "invalid".
//    fifteen ==> fte
//    apple ==> ppl
//    hey ==> invalid
//    java ==> invalid
//    whatsup ==> ats
//    $ ==> invalid
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length() % 2 != 0 && word.length() >= 5) {
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        } else {
            System.out.println("invalid");
        }
    }
}
